original test path: /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java
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
[INFO] Compiling 6 source files to /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.255 s
[INFO] Finished at: 2025-12-08T22:54:09-03:00
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
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester/Repos/sachin-handiekar_jInstagram/src/main/resources
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
22:54:13.714 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:13.719 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
22:54:13.755 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:54:13.755 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
22:54:13.760 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:54:13.761 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:13.835 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:13.835 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:54:13.841 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
22:54:14.007 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
22:54:14.008 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.008 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:54:14.009 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:54:14.011 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:54:14.013 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.013 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.016 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.016 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:54:14.017 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.017 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:54:14.019 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.020 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.023 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
22:54:14.024 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
22:54:14.024 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData_ESTest
22:54:14.026 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData_ESTest
22:54:14.026 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:54:14.026 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
22:54:14.027 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData_ESTest_scaffolding
22:54:14.030 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/entity/comments/CommentData_ESTest_scaffolding
22:54:14.030 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:54:14.030 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
22:54:14.033 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
22:54:14.033 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
22:54:14.034 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:54:14.034 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
22:54:14.036 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:54:14.036 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
22:54:14.042 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:14.043 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
22:54:14.043 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest
22:54:14.044 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest
22:54:14.044 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:54:14.045 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
22:54:14.045 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
22:54:14.048 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
22:54:14.048 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:54:14.049 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:14.050 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.050 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:54:14.051 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
22:54:14.053 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
22:54:14.053 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.053 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:54:14.054 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:54:14.056 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:54:14.057 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.057 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.059 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:14.060 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
22:54:14.060 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:54:14.061 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
22:54:14.062 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:54:14.063 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:14.065 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.065 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:54:14.066 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.066 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:54:14.068 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:54:14.068 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.070 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
22:54:14.070 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
22:54:14.071 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:54:14.071 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
22:54:14.072 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:54:14.072 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
[INFO] Running org.jinstagram.auth.model.OAuthConfig_ESTest
22:54:14.315 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
22:54:14.315 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
22:54:14.316 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
22:54:14.316 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
22:54:14.316 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
22:54:14.316 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
22:54:14.316 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
22:54:14.316 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
22:54:14.337 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
22:54:14.337 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
22:54:14.338 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
22:54:14.340 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
22:54:14.341 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.216 s -- in org.jinstagram.auth.model.OAuthConfig_ESTest
[INFO] Running org.jinstagram.auth.InstagramAuthService_ESTest
22:54:14.382 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
22:54:14.382 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
22:54:14.382 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
22:54:14.382 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
22:54:14.382 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
22:54:14.383 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
22:54:14.383 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
22:54:14.383 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
22:54:14.384 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService
22:54:14.385 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService'.
22:54:14.386 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService
22:54:14.388 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService
22:54:14.389 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService
22:54:14.389 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramApi
22:54:14.390 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramApi'.
22:54:14.391 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
22:54:14.392 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
22:54:14.393 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramApi
22:54:14.393 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.AccessTokenExtractor
22:54:14.393 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.AccessTokenExtractor'.
22:54:14.395 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.AccessTokenExtractor
22:54:14.395 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.utils.Preconditions
22:54:14.395 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.utils.Preconditions'.
22:54:14.396 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
22:54:14.402 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
22:54:14.403 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.utils, 2088513429
22:54:14.403 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.utils.Preconditions
22:54:14.407 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.oauth.InstagramService
22:54:14.407 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.oauth.InstagramService'.
22:54:14.410 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
22:54:14.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
22:54:14.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
22:54:14.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
22:54:14.413 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.oauth, -718108051
22:54:14.414 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.oauth.InstagramService
22:54:14.414 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.exceptions.OAuthException
22:54:14.414 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.exceptions.OAuthException'.
22:54:14.415 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
22:54:14.430 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
22:54:14.430 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.exceptions, 1157870574
22:54:14.431 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.exceptions.OAuthException
22:54:14.431 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.InstagramClient
22:54:14.431 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.InstagramClient'.
22:54:14.435 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram, 657905618
22:54:14.435 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.InstagramClient
22:54:14.436 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
22:54:14.436 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
22:54:14.437 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
22:54:14.438 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
22:54:14.438 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
22:54:14.439 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Verbs
22:54:14.439 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Verbs'.
22:54:14.439 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
22:54:14.440 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
22:54:14.440 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.http, 898268452
22:54:14.441 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Verbs
22:54:14.441 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token
22:54:14.441 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token'.
22:54:14.442 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
22:54:14.444 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
22:54:14.445 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token
22:54:14.445 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Verifier
22:54:14.445 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Verifier'.
22:54:14.446 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
22:54:14.447 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
22:54:14.447 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Verifier
22:54:14.447 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthRequest
22:54:14.447 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthRequest'.
22:54:14.448 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
22:54:14.450 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
22:54:14.450 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
22:54:14.451 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Request
22:54:14.451 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Request'.
22:54:14.452 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
22:54:14.456 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
22:54:14.457 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
22:54:14.458 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Request
22:54:14.458 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthRequest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 s -- in org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] Running org.jinstagram.entity.comments.CommentData_ESTest
22:54:14.471 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
22:54:14.472 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
22:54:14.474 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData
22:54:14.474 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData'.
22:54:14.475 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData
22:54:14.476 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData
22:54:14.477 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData
22:54:14.478 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.common.FromTagData
22:54:14.478 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.common.FromTagData'.
22:54:14.479 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/FromTagData
22:54:14.480 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/FromTagData
22:54:14.481 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.entity.common, 1839157562
22:54:14.481 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.common.FromTagData
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 s -- in org.jinstagram.entity.comments.CommentData_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.550 s
[INFO] Finished at: 2025-12-08T22:54:14-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
