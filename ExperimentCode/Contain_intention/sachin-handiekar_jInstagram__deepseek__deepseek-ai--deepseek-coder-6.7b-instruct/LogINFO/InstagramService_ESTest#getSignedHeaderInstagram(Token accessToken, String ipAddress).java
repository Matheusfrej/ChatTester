original test path: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -------------------< com.sachinhandiekar:jInstagram >-------------------
[INFO] Building jInstagram 1.2.3-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:1.0:enforce (enforce-maven) @ jInstagram ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ jInstagram ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ jInstagram ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 3 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java uses or overrides a deprecated API.
[WARNING] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java: Recompile with -Xlint:deprecation for details.
[INFO] 2 warnings 
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[32,45] cannot find symbol
  symbol:   class Builder
  location: class org.jinstagram.auth.model.OAuthConfig
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[37,28] constructor InstagramApi in class org.jinstagram.auth.InstagramApi cannot be applied to given types;
  required: no arguments
  found: org.jinstagram.auth.model.OAuthConfig
  reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[43,9] cannot find symbol
  symbol:   class InstagramClient
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[INFO] 3 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.883 s
[INFO] Finished at: 2025-12-07T13:43:53-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[32,45] cannot find symbol
[ERROR]   symbol:   class Builder
[ERROR]   location: class org.jinstagram.auth.model.OAuthConfig
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[37,28] constructor InstagramApi in class org.jinstagram.auth.InstagramApi cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: org.jinstagram.auth.model.OAuthConfig
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[43,9] cannot find symbol
[ERROR]   symbol:   class InstagramClient
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
