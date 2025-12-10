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
[INFO] Total time:  2.265 s
[INFO] Finished at: 2025-12-08T22:55:21-03:00
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
22:55:26.102 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.107 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
22:55:26.143 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:55:26.143 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
22:55:26.148 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:55:26.148 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.223 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.223 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:55:26.229 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
22:55:26.388 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
22:55:26.388 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.389 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:55:26.390 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:55:26.393 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:55:26.395 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.395 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.398 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.398 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:55:26.399 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.400 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:55:26.402 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.402 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.407 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
22:55:26.407 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
22:55:26.408 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData_ESTest
22:55:26.409 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData_ESTest
22:55:26.410 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:55:26.410 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
22:55:26.411 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData_ESTest_scaffolding
22:55:26.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/entity/comments/CommentData_ESTest_scaffolding
22:55:26.414 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:55:26.414 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
22:55:26.417 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
22:55:26.417 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
22:55:26.418 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:55:26.418 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
22:55:26.420 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:55:26.420 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
22:55:26.427 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.427 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
22:55:26.427 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest
22:55:26.428 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest
22:55:26.429 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:55:26.429 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
22:55:26.430 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
22:55:26.432 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
22:55:26.432 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:55:26.432 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.434 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.434 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:55:26.434 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
22:55:26.436 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
22:55:26.437 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.437 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:55:26.437 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:55:26.439 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
22:55:26.440 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.440 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.442 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.442 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
22:55:26.443 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:55:26.443 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
22:55:26.445 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
22:55:26.445 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.448 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.448 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
22:55:26.449 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.450 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
22:55:26.451 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
22:55:26.451 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.453 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest
22:55:26.453 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest'.
22:55:26.454 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:55:26.454 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData_ESTest_scaffolding'.
22:55:26.456 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest_scaffolding
22:55:26.456 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData_ESTest
[INFO] Running org.jinstagram.auth.model.OAuthConfig_ESTest
22:55:26.698 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
22:55:26.699 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
22:55:26.719 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
22:55:26.719 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
22:55:26.720 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
22:55:26.722 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
22:55:26.723 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.213 s -- in org.jinstagram.auth.model.OAuthConfig_ESTest
[INFO] Running org.jinstagram.auth.InstagramAuthService_ESTest
22:55:26.762 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
22:55:26.763 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
22:55:26.765 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService
22:55:26.765 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService'.
22:55:26.766 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService
22:55:26.768 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService
22:55:26.769 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService
22:55:26.770 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramApi
22:55:26.770 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramApi'.
22:55:26.771 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
22:55:26.773 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
22:55:26.773 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramApi
22:55:26.773 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.AccessTokenExtractor
22:55:26.773 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.AccessTokenExtractor'.
22:55:26.775 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.AccessTokenExtractor
22:55:26.776 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.utils.Preconditions
22:55:26.776 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.utils.Preconditions'.
22:55:26.777 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
22:55:26.785 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
22:55:26.786 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.utils, 2088513429
22:55:26.786 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.utils.Preconditions
22:55:26.789 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.oauth.InstagramService
22:55:26.790 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.oauth.InstagramService'.
22:55:26.793 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
22:55:26.797 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
22:55:26.797 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
22:55:26.797 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
22:55:26.797 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.oauth, -718108051
22:55:26.798 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.oauth.InstagramService
22:55:26.798 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.exceptions.OAuthException
22:55:26.799 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.exceptions.OAuthException'.
22:55:26.800 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
22:55:26.810 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
22:55:26.810 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.exceptions, 1157870574
22:55:26.811 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.exceptions.OAuthException
22:55:26.811 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.InstagramClient
22:55:26.811 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.InstagramClient'.
22:55:26.816 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram, 657905618
22:55:26.817 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.InstagramClient
22:55:26.818 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
22:55:26.818 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
22:55:26.819 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
22:55:26.821 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
22:55:26.821 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
22:55:26.822 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Verbs
22:55:26.822 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Verbs'.
22:55:26.822 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
22:55:26.823 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
22:55:26.824 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.http, 898268452
22:55:26.824 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Verbs
22:55:26.825 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token
22:55:26.825 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token'.
22:55:26.825 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
22:55:26.828 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
22:55:26.829 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token
22:55:26.829 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Verifier
22:55:26.829 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Verifier'.
22:55:26.829 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
22:55:26.830 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
22:55:26.830 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Verifier
22:55:26.830 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthRequest
22:55:26.830 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthRequest'.
22:55:26.831 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
22:55:26.833 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
22:55:26.833 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
22:55:26.833 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Request
22:55:26.834 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Request'.
22:55:26.835 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
22:55:26.838 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
22:55:26.839 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
22:55:26.839 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Request
22:55:26.840 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthRequest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.089 s -- in org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] Running org.jinstagram.entity.comments.CommentData_ESTest
22:55:26.853 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
22:55:26.853 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
22:55:26.853 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
22:55:26.853 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
22:55:26.854 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
22:55:26.854 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
22:55:26.854 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
22:55:26.854 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
22:55:26.855 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.comments.CommentData
22:55:26.855 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.comments.CommentData'.
22:55:26.857 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData
22:55:26.858 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData
22:55:26.859 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.comments.CommentData
22:55:26.860 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.entity.common.FromTagData
22:55:26.860 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.entity.common.FromTagData'.
22:55:26.861 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/FromTagData
22:55:26.863 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/FromTagData
22:55:26.863 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.entity.common, 1839157562
22:55:26.863 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.entity.common.FromTagData
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 s -- in org.jinstagram.entity.comments.CommentData_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.555 s
[INFO] Finished at: 2025-12-08T22:55:26-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
