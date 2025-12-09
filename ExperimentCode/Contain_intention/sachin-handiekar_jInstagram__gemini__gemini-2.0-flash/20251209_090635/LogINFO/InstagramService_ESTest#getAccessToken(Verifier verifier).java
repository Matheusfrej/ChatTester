original test path: /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java
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
[INFO] Compiling 12 source files to /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java:[22,38] cannot find symbol
  symbol:   class FromTagData
  location: package org.jinstagram.entity.comments
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[14,33] cannot find symbol
  symbol:   class Response
  location: package org.jinstagram.auth.model
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[16,38] package org.jinstagram.auth.extractors does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[35,52] cannot find symbol
  symbol:   class IOException
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java:[44,35] constructor FromTagData in class org.jinstagram.entity.common.FromTagData cannot be applied to given types;
  required: no arguments
  found: java.lang.String,java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java:[45,35] constructor CommentData in class org.jinstagram.entity.comments.CommentData cannot be applied to given types;
  required: no arguments
  found: org.jinstagram.entity.common.FromTagData,java.lang.String,java.lang.String,java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[37,28] cannot find symbol
  symbol:   method mock(java.lang.Class<org.jinstagram.auth.InstagramApi>)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[38,30] cannot find symbol
  symbol:   method mock(java.lang.Class<org.jinstagram.auth.model.OAuthConfig>)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[40,32] cannot find symbol
  symbol:   method mock(java.lang.Class<org.jinstagram.auth.model.OAuthRequest>)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[41,9] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[41,34] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[42,9] cannot find symbol
  symbol:   class TokenExtractor
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[42,46] cannot find symbol
  symbol:   class TokenExtractor
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[47,67] package org.scribe.model does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[47,9] cannot find symbol
  symbol:   method when(org.jinstagram.http.Verbs)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[48,9] cannot find symbol
  symbol:   method when(java.lang.String)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[49,9] cannot find symbol
  symbol:   method when(java.lang.String)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[50,9] cannot find symbol
  symbol:   method when(java.lang.String)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[51,9] cannot find symbol
  symbol:   method when(java.lang.String)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[52,9] cannot find symbol
  symbol:   method when(org.jinstagram.auth.AccessTokenExtractor)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[53,37] cannot find symbol
  symbol:   method anyString()
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[38,9] cannot find symbol
  symbol:   variable authService
  location: class org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] 22 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.680 s
[INFO] Finished at: 2025-12-09T09:07:07-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java:[22,38] cannot find symbol
[ERROR]   symbol:   class FromTagData
[ERROR]   location: package org.jinstagram.entity.comments
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[14,33] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: package org.jinstagram.auth.model
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[16,38] package org.jinstagram.auth.extractors does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[35,52] cannot find symbol
[ERROR]   symbol:   class IOException
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java:[44,35] constructor FromTagData in class org.jinstagram.entity.common.FromTagData cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String,java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java:[45,35] constructor CommentData in class org.jinstagram.entity.comments.CommentData cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: org.jinstagram.entity.common.FromTagData,java.lang.String,java.lang.String,java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[37,28] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<org.jinstagram.auth.InstagramApi>)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[38,30] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<org.jinstagram.auth.model.OAuthConfig>)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[40,32] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<org.jinstagram.auth.model.OAuthRequest>)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[41,9] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[41,34] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[42,9] cannot find symbol
[ERROR]   symbol:   class TokenExtractor
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[42,46] cannot find symbol
[ERROR]   symbol:   class TokenExtractor
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[47,67] package org.scribe.model does not exist
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[47,9] cannot find symbol
[ERROR]   symbol:   method when(org.jinstagram.http.Verbs)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[48,9] cannot find symbol
[ERROR]   symbol:   method when(java.lang.String)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[49,9] cannot find symbol
[ERROR]   symbol:   method when(java.lang.String)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[50,9] cannot find symbol
[ERROR]   symbol:   method when(java.lang.String)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[51,9] cannot find symbol
[ERROR]   symbol:   method when(java.lang.String)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[52,9] cannot find symbol
[ERROR]   symbol:   method when(org.jinstagram.auth.AccessTokenExtractor)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[53,37] cannot find symbol
[ERROR]   symbol:   method anyString()
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[38,9] cannot find symbol
[ERROR]   symbol:   variable authService
[ERROR]   location: class org.jinstagram.auth.InstagramAuthService_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
