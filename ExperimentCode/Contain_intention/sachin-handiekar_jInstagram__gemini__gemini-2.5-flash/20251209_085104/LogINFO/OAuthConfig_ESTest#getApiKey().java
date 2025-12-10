original test path: /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthConfig_ESTest.java
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
[INFO] Total time:  2.254 s
[INFO] Finished at: 2025-12-09T09:04:14-03:00
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
09:04:19.080 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.086 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
09:04:19.132 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
09:04:19.133 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
09:04:19.139 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
09:04:19.139 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.232 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
09:04:19.232 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
09:04:19.239 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest
09:04:19.417 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest
09:04:19.418 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:04:19.418 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
09:04:19.419 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
09:04:19.422 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/InstagramAuthService_ESTest_scaffolding
09:04:19.424 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:04:19.424 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
09:04:19.427 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
09:04:19.427 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
09:04:19.428 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:04:19.428 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
09:04:19.430 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:04:19.430 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
09:04:19.438 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.438 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
09:04:19.439 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest
09:04:19.440 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest
09:04:19.441 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
09:04:19.441 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
09:04:19.442 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
09:04:19.445 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/auth/model/OAuthConfig_ESTest_scaffolding
09:04:19.446 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
09:04:19.446 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.451 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.451 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest'.
09:04:19.452 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
09:04:19.452 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding'.
09:04:19.454 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest_scaffolding
09:04:19.454 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.456 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest
09:04:19.457 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest'.
09:04:19.458 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:04:19.458 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding'.
09:04:19.460 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest_scaffolding
09:04:19.460 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] Running org.jinstagram.auth.model.OAuthConfig_ESTest
09:04:19.733 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
09:04:19.734 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
09:04:19.734 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
09:04:19.734 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
09:04:19.734 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
09:04:19.734 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
09:04:19.735 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
09:04:19.735 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
09:04:19.765 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
09:04:19.766 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
09:04:19.767 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
09:04:19.773 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
09:04:19.774 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.256 s -- in org.jinstagram.auth.model.OAuthConfig_ESTest
[INFO] Running org.jinstagram.auth.InstagramAuthService_ESTest
09:04:19.824 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
09:04:19.824 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
09:04:19.824 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
09:04:19.825 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
09:04:19.825 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
09:04:19.825 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
09:04:19.825 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
09:04:19.825 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
09:04:19.826 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramAuthService
09:04:19.827 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramAuthService'.
09:04:19.828 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramAuthService
09:04:19.832 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramAuthService
09:04:19.833 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramAuthService
09:04:19.834 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.InstagramApi
09:04:19.834 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.InstagramApi'.
09:04:19.835 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
09:04:19.837 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
09:04:19.837 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.InstagramApi
09:04:19.838 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.AccessTokenExtractor
09:04:19.838 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.AccessTokenExtractor'.
09:04:19.841 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.AccessTokenExtractor
09:04:19.842 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.utils.Preconditions
09:04:19.842 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.utils.Preconditions'.
09:04:19.844 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
09:04:19.851 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
09:04:19.852 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.utils, 2088513429
09:04:19.853 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.utils.Preconditions
09:04:19.859 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.oauth.InstagramService
09:04:19.859 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.oauth.InstagramService'.
09:04:19.862 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
09:04:19.868 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
09:04:19.868 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
09:04:19.868 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
09:04:19.869 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.oauth, -718108051
09:04:19.869 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.oauth.InstagramService
09:04:19.870 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.InstagramClient
09:04:19.870 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.InstagramClient'.
09:04:19.875 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram, 657905618
09:04:19.876 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.InstagramClient
09:04:19.877 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.exceptions.OAuthException
09:04:19.877 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.exceptions.OAuthException'.
09:04:19.878 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
09:04:19.881 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
09:04:19.881 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.auth.exceptions, 1157870574
09:04:19.882 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.exceptions.OAuthException
09:04:19.883 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthConfig
09:04:19.883 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthConfig'.
09:04:19.884 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
09:04:19.886 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
09:04:19.889 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthConfig
09:04:19.890 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Verbs
09:04:19.890 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Verbs'.
09:04:19.891 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
09:04:19.901 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
09:04:19.902 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Defined package (3): package org.jinstagram.http, 898268452
09:04:19.902 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Verbs
09:04:19.903 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Token
09:04:19.903 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Token'.
09:04:19.904 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
09:04:19.908 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
09:04:19.909 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Token
09:04:19.910 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.OAuthRequest
09:04:19.910 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.OAuthRequest'.
09:04:19.911 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
09:04:19.916 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
09:04:19.916 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
09:04:19.917 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.http.Request
09:04:19.917 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.http.Request'.
09:04:19.919 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
09:04:19.925 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
09:04:19.925 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
09:04:19.926 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.http.Request
09:04:19.926 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.OAuthRequest
09:04:19.926 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Seeing class for first time: org.jinstagram.auth.model.Verifier
09:04:19.927 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Instrumenting class 'org.jinstagram.auth.model.Verifier'.
09:04:19.928 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
09:04:19.929 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
09:04:19.929 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader - Keeping class: org.jinstagram.auth.model.Verifier
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.115 s -- in org.jinstagram.auth.InstagramAuthService_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.935 s
[INFO] Finished at: 2025-12-09T09:04:20-03:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
