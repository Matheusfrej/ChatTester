original test path: /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java
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
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[9,26] package org.mockito does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[26,35] cannot find symbol
  symbol:   method mock(java.lang.Class<technology.tabula.TextChunk>)
  location: class technology.tabula.Line_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[27,30] cannot find symbol
  symbol:   method mock(java.lang.Class<technology.tabula.TextChunk>)
  location: class technology.tabula.Line_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[28,45] cannot find symbol
  symbol:   class ArrayList
  location: class technology.tabula.Line_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[32,9] cannot find symbol
  symbol:   method when(technology.tabula.TextChunk)
  location: class technology.tabula.Line_ESTest
[INFO] 5 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.329 s
[INFO] Finished at: 2025-12-09T11:27:30-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[9,26] package org.mockito does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[26,35] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<technology.tabula.TextChunk>)
[ERROR]   location: class technology.tabula.Line_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[27,30] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<technology.tabula.TextChunk>)
[ERROR]   location: class technology.tabula.Line_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[28,45] cannot find symbol
[ERROR]   symbol:   class ArrayList
[ERROR]   location: class technology.tabula.Line_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java:[32,9] cannot find symbol
[ERROR]   symbol:   method when(technology.tabula.TextChunk)
[ERROR]   location: class technology.tabula.Line_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
