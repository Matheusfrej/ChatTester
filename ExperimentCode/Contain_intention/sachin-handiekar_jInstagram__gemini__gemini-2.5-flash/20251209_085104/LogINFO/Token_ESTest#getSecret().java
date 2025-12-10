original test path: /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/Token_ESTest.java
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
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.247 s
[INFO] Finished at: 2025-12-09T09:00:20-03:00
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
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/sachin-handiekar_jInstagram/src/main/resources
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
09:00:25.339 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token_ESTest
09:00:25.344 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token_ESTest'.
09:00:25.379 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token_ESTest_scaffolding
09:00:25.379 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token_ESTest_scaffolding'.
09:00:25.383 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token_ESTest_scaffolding
09:00:25.383 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token_ESTest
09:00:25.458 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
09:00:25.458 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
09:00:25.465 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
09:00:25.629 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
09:00:25.630 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:00:25.630 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
09:00:25.631 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
09:00:25.633 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
09:00:25.635 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:00:25.636 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
09:00:25.638 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
09:00:25.638 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
09:00:25.639 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:00:25.639 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
09:00:25.641 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:00:25.642 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
09:00:25.648 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token_ESTest
09:00:25.648 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token_ESTest'.
09:00:25.649 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token_ESTest
09:00:25.650 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token_ESTest
09:00:25.650 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token_ESTest_scaffolding
09:00:25.650 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token_ESTest_scaffolding'.
09:00:25.651 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token_ESTest_scaffolding
09:00:25.653 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/model/Token_ESTest_scaffolding
09:00:25.654 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token_ESTest_scaffolding
09:00:25.654 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token_ESTest
09:00:25.656 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token_ESTest
09:00:25.657 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token_ESTest'.
09:00:25.658 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token_ESTest_scaffolding
09:00:25.658 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token_ESTest_scaffolding'.
09:00:25.660 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token_ESTest_scaffolding
09:00:25.660 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token_ESTest
09:00:25.663 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
09:00:25.663 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
09:00:25.664 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:00:25.664 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
09:00:25.665 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:00:25.666 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] Running org.jinstagram.auth.model.Token_ESTest
09:00:25.902 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
09:00:25.903 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
09:00:25.926 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token
09:00:25.927 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token'.
09:00:25.928 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
09:00:25.934 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
09:00:25.935 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.212 s -- in org.jinstagram.auth.model.Token_ESTest
[INFO] Running org.jinstagram.auth.InstagramAuthService_ESTest
09:00:25.976 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
09:00:25.976 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
09:00:25.976 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
09:00:25.976 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
09:00:25.976 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
09:00:25.976 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
09:00:25.977 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
09:00:25.977 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
09:00:25.978 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService
09:00:25.978 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService'.
09:00:25.979 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService
09:00:25.982 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService
09:00:25.982 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService
09:00:25.983 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramApi
09:00:25.983 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramApi'.
09:00:25.984 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
09:00:25.985 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
09:00:25.985 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramApi
09:00:25.985 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.AccessTokenExtractor
09:00:25.986 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.AccessTokenExtractor'.
09:00:25.987 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.AccessTokenExtractor
09:00:25.987 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.utils.Preconditions
09:00:25.987 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.utils.Preconditions'.
09:00:25.988 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
09:00:25.993 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
09:00:25.994 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.utils, 2088513429
09:00:25.995 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.utils.Preconditions
09:00:25.999 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.oauth.InstagramService
09:00:25.999 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.oauth.InstagramService'.
09:00:26.002 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
09:00:26.006 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
09:00:26.006 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
09:00:26.006 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
09:00:26.006 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.oauth, -718108051
09:00:26.006 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.oauth.InstagramService
09:00:26.007 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.InstagramClient
09:00:26.007 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.InstagramClient'.
09:00:26.009 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram, 657905618
09:00:26.010 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.InstagramClient
09:00:26.010 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.exceptions.OAuthException
09:00:26.011 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.exceptions.OAuthException'.
09:00:26.011 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
09:00:26.012 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
09:00:26.012 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.exceptions, 1157870574
09:00:26.013 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.exceptions.OAuthException
09:00:26.013 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
09:00:26.013 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
09:00:26.014 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
09:00:26.016 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
09:00:26.017 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
09:00:26.017 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Verbs
09:00:26.017 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Verbs'.
09:00:26.018 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
09:00:26.026 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
09:00:26.026 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.http, 898268452
09:00:26.026 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Verbs
09:00:26.027 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token
09:00:26.027 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token'.
09:00:26.027 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
09:00:26.030 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
09:00:26.031 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token
09:00:26.031 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthRequest
09:00:26.031 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthRequest'.
09:00:26.032 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
09:00:26.037 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
09:00:26.037 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
09:00:26.037 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Request
09:00:26.037 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Request'.
09:00:26.039 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
09:00:26.042 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
09:00:26.042 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
09:00:26.043 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Request
09:00:26.043 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthRequest
09:00:26.043 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Verifier
09:00:26.043 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Verifier'.
09:00:26.044 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
09:00:26.044 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
09:00:26.044 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Verifier
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.076 s -- in org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.907 s
[INFO] Finished at: 2025-12-09T09:00:26-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
