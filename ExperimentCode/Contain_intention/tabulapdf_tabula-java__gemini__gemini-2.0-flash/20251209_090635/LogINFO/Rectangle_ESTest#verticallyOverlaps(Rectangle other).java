original test path: /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Rectangle_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ tabula ---
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.297 s
[INFO] Finished at: 2025-12-09T11:38:52-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US

########## Test INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.061 s
[INFO] Finished at: 2025-12-09T11:38:56-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Plugin org.apache.maven.plugins:maven-surefire-plugin:2.22.2 or one of its dependencies could not be resolved: Failed to read artifact descriptor for org.apache.maven.plugins:maven-surefire-plugin:jar:2.22.2: The following artifacts could not be resolved: org.apache.maven.plugins:maven-surefire-plugin:pom:2.22.2 (absent): Could not transfer artifact org.apache.maven.plugins:maven-surefire-plugin:pom:2.22.2 from/to central (https://repo.maven.apache.org/maven2): sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/PluginResolutionException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
