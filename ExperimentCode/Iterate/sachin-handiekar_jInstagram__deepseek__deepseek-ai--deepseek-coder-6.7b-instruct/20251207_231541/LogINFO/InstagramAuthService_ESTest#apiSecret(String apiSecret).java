original test path: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java
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
[INFO] Compiling 10 source files to /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java uses or overrides a deprecated API.
[WARNING] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java: Recompile with -Xlint:deprecation for details.
[WARNING] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] 3 warnings 
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[12,38] cannot find symbol
  symbol:   class Meta
  location: package org.jinstagram.entity.comments
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[41,36] method apiSecret in class org.jinstagram.auth.InstagramAuthService cannot be applied to given types;
  required: java.lang.String
  found: no arguments
  reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,9] cannot find symbol
  symbol:   class InstagramClient
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[31,26] incompatible types: java.lang.String cannot be converted to int
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[40,24] cannot find symbol
  symbol:   method setFrom(java.lang.String)
  location: variable mockCommentData of type org.jinstagram.entity.comments.CommentData
[INFO] 5 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.923 s
[INFO] Finished at: 2025-12-08T12:45:00-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[12,38] cannot find symbol
[ERROR]   symbol:   class Meta
[ERROR]   location: package org.jinstagram.entity.comments
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[41,36] method apiSecret in class org.jinstagram.auth.InstagramAuthService cannot be applied to given types;
[ERROR]   required: java.lang.String
[ERROR]   found: no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,9] cannot find symbol
[ERROR]   symbol:   class InstagramClient
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[31,26] incompatible types: java.lang.String cannot be converted to int
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[40,24] cannot find symbol
[ERROR]   symbol:   method setFrom(java.lang.String)
[ERROR]   location: variable mockCommentData of type org.jinstagram.entity.comments.CommentData
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
