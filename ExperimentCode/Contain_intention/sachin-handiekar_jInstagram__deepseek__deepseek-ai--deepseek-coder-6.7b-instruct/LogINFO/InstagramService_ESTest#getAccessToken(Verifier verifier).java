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
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[14,27] cannot find symbol
  symbol:   class OAuthRequest
  location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[15,27] cannot find symbol
  symbol:   class Response
  location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[16,27] cannot find symbol
  symbol:   class OAuthConstants
  location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[17,27] cannot find symbol
  symbol:   class OAuthException
  location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[18,37] package org.jinstagram.auth.extractor does not exist
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[47,47] no suitable method found for thenReturn(java.lang.String)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[50,25] cannot find symbol
  symbol:   method createOAuthRequest(java.lang.String)
  location: variable api of type org.jinstagram.auth.InstagramApi
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[51,9] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[51,42] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[54,9] cannot find symbol
  symbol:   class AccessTokenExtractor
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[54,55] cannot find symbol
  symbol:   class AccessTokenExtractor
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,73] no suitable constructor found for Token(java.lang.String)
    constructor org.jinstagram.auth.model.Token.Token(java.lang.String,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
    constructor org.jinstagram.auth.model.Token.Token(java.lang.String,java.lang.String,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[64,50] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[65,50] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[66,50] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[67,50] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[68,50] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[INFO] 17 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.126 s
[INFO] Finished at: 2025-12-07T13:42:30-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[14,27] cannot find symbol
[ERROR]   symbol:   class OAuthRequest
[ERROR]   location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[15,27] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[16,27] cannot find symbol
[ERROR]   symbol:   class OAuthConstants
[ERROR]   location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[17,27] cannot find symbol
[ERROR]   symbol:   class OAuthException
[ERROR]   location: package org.jinstagram.auth
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[18,37] package org.jinstagram.auth.extractor does not exist
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[47,47] no suitable method found for thenReturn(java.lang.String)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[50,25] cannot find symbol
[ERROR]   symbol:   method createOAuthRequest(java.lang.String)
[ERROR]   location: variable api of type org.jinstagram.auth.InstagramApi
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[51,9] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[51,42] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[54,9] cannot find symbol
[ERROR]   symbol:   class AccessTokenExtractor
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[54,55] cannot find symbol
[ERROR]   symbol:   class AccessTokenExtractor
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,73] no suitable constructor found for Token(java.lang.String)
[ERROR]     constructor org.jinstagram.auth.model.Token.Token(java.lang.String,java.lang.String) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor org.jinstagram.auth.model.Token.Token(java.lang.String,java.lang.String,java.lang.String) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[64,50] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[65,50] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[66,50] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[67,50] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[68,50] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
