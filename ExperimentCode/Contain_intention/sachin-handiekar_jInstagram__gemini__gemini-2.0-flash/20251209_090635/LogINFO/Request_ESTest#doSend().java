original test path: /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -------------------< com.sachinhandiekar:jInstagram >-------------------
[INFO] Building jInstagram 1.2.3-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- enforcer:1.0:enforce (enforce-maven) @ jInstagram ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ jInstagram ---
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[33,40] cannot find symbol
  symbol:   class IOException
  location: class org.jinstagram.http.Request_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[37,40] reference to mock is ambiguous
  both method <T>mock(java.lang.Class<T>) in org.evosuite.shaded.org.mockito.Mockito and method <T>mock(java.lang.Class<T>) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[43,9] reference to when is ambiguous
  both method <T>when(T) in org.evosuite.shaded.org.mockito.Mockito and method <T>when(T) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[44,9] reference to when is ambiguous
  both method <T>when(T) in org.evosuite.shaded.org.mockito.Mockito and method <T>when(T) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[51,9] reference to verify is ambiguous
  both method <T>verify(T) in org.evosuite.shaded.org.mockito.Mockito and method <T>verify(T) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[56,62] reference to anyString is ambiguous
  both method anyString() in org.evosuite.shaded.org.mockito.Mockito and method anyString() in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[56,75] reference to anyString is ambiguous
  both method anyString() in org.evosuite.shaded.org.mockito.Mockito and method anyString() in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[56,28] reference to atLeastOnce is ambiguous
  both method atLeastOnce() in org.evosuite.shaded.org.mockito.Mockito and method atLeastOnce() in org.mockito.Mockito match
[INFO] 8 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.183 s
[INFO] Finished at: 2025-12-09T11:05:51-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[33,40] cannot find symbol
[ERROR]   symbol:   class IOException
[ERROR]   location: class org.jinstagram.http.Request_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[37,40] reference to mock is ambiguous
[ERROR]   both method <T>mock(java.lang.Class<T>) in org.evosuite.shaded.org.mockito.Mockito and method <T>mock(java.lang.Class<T>) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[43,9] reference to when is ambiguous
[ERROR]   both method <T>when(T) in org.evosuite.shaded.org.mockito.Mockito and method <T>when(T) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[44,9] reference to when is ambiguous
[ERROR]   both method <T>when(T) in org.evosuite.shaded.org.mockito.Mockito and method <T>when(T) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[51,9] reference to verify is ambiguous
[ERROR]   both method <T>verify(T) in org.evosuite.shaded.org.mockito.Mockito and method <T>verify(T) in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[56,62] reference to anyString is ambiguous
[ERROR]   both method anyString() in org.evosuite.shaded.org.mockito.Mockito and method anyString() in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[56,75] reference to anyString is ambiguous
[ERROR]   both method anyString() in org.evosuite.shaded.org.mockito.Mockito and method anyString() in org.mockito.Mockito match
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java:[56,28] reference to atLeastOnce is ambiguous
[ERROR]   both method atLeastOnce() in org.evosuite.shaded.org.mockito.Mockito and method atLeastOnce() in org.mockito.Mockito match
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
