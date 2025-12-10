original test path: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java
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
[INFO] Compiling 17 source files to /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
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
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[15,29] cannot find symbol
  symbol:   class MediaCommentResponse
  location: package org.jinstagram.entity
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[10,22] package oauth.signpost does not exist
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[17,20] cannot find symbol
  symbol:   class runtimeMockInetSocketAddress
  location: package org.evosuite
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthRequest_ESTest.java:[11,33] cannot find symbol
  symbol:   class Verbs
  location: package org.jinstagram.auth.model
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[18,38] cannot find symbol
  symbol:   class Meta
  location: package org.jinstagram.entity.comments
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[10,25] cannot find symbol
  symbol:   class MockitoJUnitRunner
  location: package org.mockito.junit
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[16,18] cannot find symbol
  symbol:   class junit
  location: package org
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[16,1] static import only from classes and interfaces
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[45,45] cannot find symbol
  symbol:   method getCommenter()
  location: variable commentData of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[46,60] cannot find symbol
  symbol:   method getCommentText()
  location: variable commentData of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[47,55] cannot find symbol
  symbol:   method getCommentTime()
  location: variable commentData of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[49,24] requestProxy has private access in org.jinstagram.auth.InstagramAuthService
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[50,19] cannot find symbol
  symbol:   method out(java.lang.String)
  location: class java.lang.System
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[56,41] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.InstagramAuthService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[56,24] callback has private access in org.jinstagram.auth.InstagramAuthService
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,9] cannot find symbol
  symbol:   class InstagramClient
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[46,21] cannot find symbol
  symbol:   method setCommentId(int)
  location: variable commentData1 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[47,21] cannot find symbol
  symbol:   method setCommentText(java.lang.String)
  location: variable commentData1 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[51,21] cannot find symbol
  symbol:   method setCommentId(int)
  location: variable commentData2 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[52,21] cannot find symbol
  symbol:   method setCommentText(java.lang.String)
  location: variable commentData2 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[59,13] cannot find symbol
  symbol:   method setTotalComments(int)
  location: variable meta of type org.jinstagram.entity.common.Meta
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[60,13] cannot find symbol
  symbol:   method setPageNumber(int)
  location: variable meta of type org.jinstagram.entity.common.Meta
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[61,13] cannot find symbol
  symbol:   method setPageSize(int)
  location: variable meta of type org.jinstagram.entity.common.Meta
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[43,35] cannot find symbol
  symbol:   method times(int)
  location: class org.jinstagram.entity.oembed.OembedInformation_ESTest
[INFO] 24 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.166 s
[INFO] Finished at: 2025-12-08T16:05:43-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[15,29] cannot find symbol
[ERROR]   symbol:   class MediaCommentResponse
[ERROR]   location: package org.jinstagram.entity
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[10,22] package oauth.signpost does not exist
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[17,20] cannot find symbol
[ERROR]   symbol:   class runtimeMockInetSocketAddress
[ERROR]   location: package org.evosuite
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthRequest_ESTest.java:[11,33] cannot find symbol
[ERROR]   symbol:   class Verbs
[ERROR]   location: package org.jinstagram.auth.model
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[18,38] cannot find symbol
[ERROR]   symbol:   class Meta
[ERROR]   location: package org.jinstagram.entity.comments
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[10,25] cannot find symbol
[ERROR]   symbol:   class MockitoJUnitRunner
[ERROR]   location: package org.mockito.junit
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[16,18] cannot find symbol
[ERROR]   symbol:   class junit
[ERROR]   location: package org
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[16,1] static import only from classes and interfaces
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[45,45] cannot find symbol
[ERROR]   symbol:   method getCommenter()
[ERROR]   location: variable commentData of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[46,60] cannot find symbol
[ERROR]   symbol:   method getCommentText()
[ERROR]   location: variable commentData of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java:[47,55] cannot find symbol
[ERROR]   symbol:   method getCommentTime()
[ERROR]   location: variable commentData of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[49,24] requestProxy has private access in org.jinstagram.auth.InstagramAuthService
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[50,19] cannot find symbol
[ERROR]   symbol:   method out(java.lang.String)
[ERROR]   location: class java.lang.System
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[56,41] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.InstagramAuthService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java:[56,24] callback has private access in org.jinstagram.auth.InstagramAuthService
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,9] cannot find symbol
[ERROR]   symbol:   class InstagramClient
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[46,21] cannot find symbol
[ERROR]   symbol:   method setCommentId(int)
[ERROR]   location: variable commentData1 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[47,21] cannot find symbol
[ERROR]   symbol:   method setCommentText(java.lang.String)
[ERROR]   location: variable commentData1 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[51,21] cannot find symbol
[ERROR]   symbol:   method setCommentId(int)
[ERROR]   location: variable commentData2 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[52,21] cannot find symbol
[ERROR]   symbol:   method setCommentText(java.lang.String)
[ERROR]   location: variable commentData2 of type org.jinstagram.entity.comments.CommentData
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[59,13] cannot find symbol
[ERROR]   symbol:   method setTotalComments(int)
[ERROR]   location: variable meta of type org.jinstagram.entity.common.Meta
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[60,13] cannot find symbol
[ERROR]   symbol:   method setPageNumber(int)
[ERROR]   location: variable meta of type org.jinstagram.entity.common.Meta
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java:[61,13] cannot find symbol
[ERROR]   symbol:   method setPageSize(int)
[ERROR]   location: variable meta of type org.jinstagram.entity.common.Meta
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java:[43,35] cannot find symbol
[ERROR]   symbol:   method times(int)
[ERROR]   location: class org.jinstagram.entity.oembed.OembedInformation_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
