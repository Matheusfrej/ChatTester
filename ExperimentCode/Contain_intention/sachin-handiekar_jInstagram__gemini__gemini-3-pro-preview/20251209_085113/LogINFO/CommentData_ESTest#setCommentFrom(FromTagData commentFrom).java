original test path: /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_3/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java
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
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_3/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_3/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.270 s
[INFO] Finished at: 2025-12-09T13:41:43-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US

########## Test INFO ##########
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
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_3/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- surefire:3.2.2:test (default-test) @ jInstagram ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
13:41:47.929 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:47.934 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
13:41:47.969 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
13:41:47.970 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
13:41:47.974 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
13:41:47.975 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:48.048 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.048 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
13:41:48.054 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
13:41:48.205 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
13:41:48.205 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.205 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
13:41:48.206 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
13:41:48.209 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
13:41:48.211 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.211 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.214 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.214 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
13:41:48.215 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.215 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
13:41:48.217 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.217 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.222 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
13:41:48.222 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
13:41:48.223 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData_ESTest
13:41:48.224 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData_ESTest
13:41:48.225 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
13:41:48.225 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
13:41:48.226 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData_ESTest_scaffolding
13:41:48.228 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/entity/comments/CommentData_ESTest_scaffolding
13:41:48.229 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
13:41:48.229 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
13:41:48.231 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
13:41:48.231 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
13:41:48.232 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
13:41:48.232 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
13:41:48.235 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
13:41:48.235 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
13:41:48.242 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:48.242 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
13:41:48.242 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest
13:41:48.243 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest
13:41:48.244 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
13:41:48.244 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
13:41:48.245 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
13:41:48.248 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
13:41:48.248 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
13:41:48.249 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:48.251 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.251 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
13:41:48.251 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
13:41:48.253 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
13:41:48.253 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.253 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
13:41:48.254 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
13:41:48.255 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
13:41:48.256 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.256 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.258 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:48.259 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
13:41:48.259 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
13:41:48.259 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
13:41:48.261 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
13:41:48.261 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:48.263 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.263 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
13:41:48.264 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.264 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
13:41:48.266 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
13:41:48.266 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.268 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
13:41:48.268 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
13:41:48.269 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
13:41:48.270 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
13:41:48.271 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
13:41:48.272 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
[INFO] Running org.jinstagram.auth.model.OAuthConfig_ESTest
13:41:48.521 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
13:41:48.522 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
13:41:48.522 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
13:41:48.522 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
13:41:48.522 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
13:41:48.523 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
13:41:48.523 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
13:41:48.523 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
13:41:48.543 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
13:41:48.543 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
13:41:48.545 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
13:41:48.548 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
13:41:48.548 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.218 s -- in org.jinstagram.auth.model.OAuthConfig_ESTest
[INFO] Running org.jinstagram.auth.InstagramAuthService_ESTest
13:41:48.588 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
13:41:48.588 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
13:41:48.588 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
13:41:48.588 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
13:41:48.589 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
13:41:48.589 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
13:41:48.589 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
13:41:48.589 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
13:41:48.590 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService
13:41:48.590 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService'.
13:41:48.591 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService
13:41:48.593 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService
13:41:48.593 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService
13:41:48.594 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramApi
13:41:48.594 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramApi'.
13:41:48.595 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
13:41:48.596 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
13:41:48.597 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramApi
13:41:48.597 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.AccessTokenExtractor
13:41:48.597 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.AccessTokenExtractor'.
13:41:48.598 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.AccessTokenExtractor
13:41:48.599 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.utils.Preconditions
13:41:48.599 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.utils.Preconditions'.
13:41:48.600 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
13:41:48.604 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
13:41:48.605 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.utils, 2088513429
13:41:48.605 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.utils.Preconditions
13:41:48.609 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.oauth.InstagramService
13:41:48.609 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.oauth.InstagramService'.
13:41:48.612 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
13:41:48.615 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
13:41:48.616 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
13:41:48.620 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
13:41:48.621 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.oauth, -718108051
13:41:48.621 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.oauth.InstagramService
13:41:48.622 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.exceptions.OAuthException
13:41:48.622 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.exceptions.OAuthException'.
13:41:48.623 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
13:41:48.633 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
13:41:48.634 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.exceptions, 1157870574
13:41:48.634 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.exceptions.OAuthException
13:41:48.634 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.InstagramClient
13:41:48.634 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.InstagramClient'.
13:41:48.639 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram, 657905618
13:41:48.639 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.InstagramClient
13:41:48.639 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
13:41:48.639 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
13:41:48.640 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
13:41:48.641 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
13:41:48.642 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
13:41:48.642 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Verbs
13:41:48.642 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Verbs'.
13:41:48.643 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
13:41:48.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
13:41:48.644 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.http, 898268452
13:41:48.644 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Verbs
13:41:48.644 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token
13:41:48.644 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token'.
13:41:48.645 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
13:41:48.648 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
13:41:48.648 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token
13:41:48.649 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Verifier
13:41:48.649 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Verifier'.
13:41:48.649 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
13:41:48.650 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
13:41:48.650 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Verifier
13:41:48.650 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthRequest
13:41:48.650 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthRequest'.
13:41:48.651 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
13:41:48.653 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
13:41:48.653 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
13:41:48.654 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Request
13:41:48.654 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Request'.
13:41:48.655 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
13:41:48.659 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
13:41:48.659 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
13:41:48.659 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Request
13:41:48.659 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthRequest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.079 s -- in org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] Running org.jinstagram.entity.comments.CommentData_ESTest
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
13:41:48.670 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
13:41:48.672 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData
13:41:48.672 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData'.
13:41:48.673 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData
13:41:48.675 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData
13:41:48.676 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData
13:41:48.676 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.common.FromTagData
13:41:48.677 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.common.FromTagData'.
13:41:48.678 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/FromTagData
13:41:48.679 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/FromTagData
13:41:48.680 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.entity.common, 1839157562
13:41:48.680 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.common.FromTagData
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s -- in org.jinstagram.entity.comments.CommentData_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.607 s
[INFO] Finished at: 2025-12-09T13:41:48-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
