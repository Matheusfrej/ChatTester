original test path: /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java
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
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[15,28] package com.example.geometry does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[45,9] cannot find symbol
  symbol:   class Point
  location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[45,24] cannot find symbol
  symbol:   method createPointWithRegion(int)
  location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[46,9] cannot find symbol
  symbol:   class Point
  location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[46,24] cannot find symbol
  symbol:   method createPointWithRegion(int)
  location: class technology.tabula.CohenSutherlandClipping_ESTest
[INFO] 5 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.507 s
[INFO] Finished at: 2025-12-09T10:56:50-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[15,28] package com.example.geometry does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[45,9] cannot find symbol
[ERROR]   symbol:   class Point
[ERROR]   location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[45,24] cannot find symbol
[ERROR]   symbol:   method createPointWithRegion(int)
[ERROR]   location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[46,9] cannot find symbol
[ERROR]   symbol:   class Point
[ERROR]   location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java:[46,24] cannot find symbol
[ERROR]   symbol:   method createPointWithRegion(int)
[ERROR]   location: class technology.tabula.CohenSutherlandClipping_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
