/*******************************************************************************
 * Copyright (c) 2015, 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.wizard

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.util.JUnitVersion

abstract class TestProjectDescriptor extends ProjectDescriptor {
	@Accessors val ProjectDescriptor testedProject
	
	new(TestedProjectDescriptor testedProject) {
		super(testedProject.config)
		this.testedProject = testedProject
	}
	
	override getSourceFolders() {
		#[Outlet.TEST_JAVA, Outlet.TEST_RESOURCES, Outlet.TEST_SRC_GEN, Outlet.TEST_XTEND_GEN].map[sourceFolder].toSet
	}
	
	def isInlined() {
		enabled && config.sourceLayout != SourceLayout.PLAIN
	}
	
	def isSeparate() {
		enabled && config.sourceLayout == SourceLayout.PLAIN
	}
	
	override getNameQualifier() {
		testedProject.nameQualifier + ".tests"
	}
	
	override getUpstreamProjects() {
		#{testedProject}
	}
	
	override isEclipsePluginProject() {
		testedProject.isEclipsePluginProject
	}
	
	override getExternalDependencies() {
		val deps = newLinkedHashSet
		deps += super.externalDependencies
		if (config.junitVersion == JUnitVersion.JUNIT_4) {
			deps += new ExternalDependency()=>[
				p2.bundleId = "org.junit"
				p2.version = "4.12.0"
				maven.groupId = "junit"
				maven.artifactId = "junit"
				maven.version = "4.12"
				maven.scope = Scope.TESTCOMPILE
			]
		}
		if (config.junitVersion == JUnitVersion.JUNIT_5) {
			deps += new ExternalDependency()=>[
				p2.bundleId = "org.junit.jupiter.api"
				p2.version = "5.1.0"
				maven.groupId = "org.junit.jupiter"
				maven.artifactId = "junit-jupiter-api"
				maven.version = "5.1.0"
				maven.scope = Scope.TESTCOMPILE
			]
		}
		return deps
	}
	
	override pom() {
		super.pom => [
			packaging = if(isEclipsePluginProject) "eclipse-test-plugin" else "jar"
			buildSection = '''
				�IF isEclipsePluginProject && needsUiHarness && isAtLeastJava9�
					<properties>
						<tycho.testArgLine>--add-modules=ALL-SYSTEM</tycho.testArgLine>
					</properties>
				�ENDIF�
				<build>
					�IF !isEclipsePluginProject && config.sourceLayout == SourceLayout.PLAIN�
						<testSourceDirectory>�Outlet.TEST_JAVA.sourceFolder�</testSourceDirectory>
						<testResources>
							<testResource>
								<directory>�Outlet.TEST_RESOURCES.sourceFolder�</directory>
								<excludes>
									<exclude>**/*.java</exclude>
									<exclude>**/*.xtend</exclude>
								</excludes>
							</testResource>
						</testResources>
					�ENDIF�
					<plugins>
						<plugin>
							<groupId>org.eclipse.xtend</groupId>
							<artifactId>xtend-maven-plugin</artifactId>
						</plugin>
						�IF isEclipsePluginProject�
							<plugin>
								<groupId>org.eclipse.tycho</groupId>
								<artifactId>tycho-surefire-plugin</artifactId>
								<version>${tycho-version}</version>
								<configuration>
									<failIfNoTests>false</failIfNoTests>
									�IF needsUiHarness�
										<useUIHarness>true</useUIHarness>
									�ENDIF�
								</configuration>
							</plugin>
							�IF needsUiHarness�
							<plugin>
								<groupId>org.eclipse.tycho</groupId>
								<artifactId>target-platform-configuration</artifactId>
								<configuration>
									<dependency-resolution>
										<extraRequirements>
											<!-- to get the org.eclipse.osgi.compatibility.state plugin
											if the target platform is Luna or later.
											(backward compatible with kepler and previous versions)
											see https://bugs.eclipse.org/bugs/show_bug.cgi?id=492149 -->
											<requirement>
												<type>eclipse-feature</type>
												<id>org.eclipse.rcp</id>
												<versionRange>0.0.0</versionRange>
											</requirement>
										</extraRequirements>
									</dependency-resolution>
								</configuration>
							</plugin>
							�ENDIF�
						�ENDIF�
						�IF !isEclipsePluginProject�
							<plugin>
								<groupId>org.codehaus.mojo</groupId>
								<artifactId>build-helper-maven-plugin</artifactId>
								<version>1.9.1</version>
								<executions>
									<execution>
										<id>add-test-source</id>
										<phase>initialize</phase>
										<goals>
											<goal>add-test-source</goal>
											<goal>add-test-resource</goal>
										</goals>
										<configuration>
											<sources>
												<source>�Outlet.TEST_SRC_GEN.sourceFolder�</source>
											</sources>
											<resources>
												<resource>
													<directory>�Outlet.TEST_SRC_GEN.sourceFolder�</directory>
													<excludes>
														<exclude>**/*.java</exclude>
													</excludes>
												</resource>
											</resources>
										</configuration>
									</execution>
								</executions>
							</plugin>
							�IF config.junitVersion == JUnitVersion.JUNIT_5�
								<!-- required to execute JUnit 5 tests -->
								<plugin>
									<groupId>org.apache.maven.plugins</groupId>
									<artifactId>maven-surefire-plugin</artifactId>
									<version>2.21.0</version>
									<dependencies>
										<dependency>
											<groupId>org.junit.platform</groupId>
											<artifactId>junit-platform-surefire-provider</artifactId>
											<version>1.2.0</version>
										</dependency>
										<dependency>
											<groupId>org.junit.jupiter</groupId>
											<artifactId>junit-jupiter-engine</artifactId>
											<version>5.1.0</version>
										</dependency>
									</dependencies>
								</plugin>
							�ENDIF�
						�ENDIF�
					</plugins>
				</build>
			'''
		]
	}
	
	def needsUiHarness() {
		false
	}
}
