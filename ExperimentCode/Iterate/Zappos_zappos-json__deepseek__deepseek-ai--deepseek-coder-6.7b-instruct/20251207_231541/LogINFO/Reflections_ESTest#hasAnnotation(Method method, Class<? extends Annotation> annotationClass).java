original test path: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -----------------------< com.zappos:zappos-json >-----------------------
[INFO] Building zappos-json 0.1-alpha
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-java) @ zappos-json ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ zappos-json ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ zappos-json ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ zappos-json ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ zappos-json ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 13 source files to /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/wrapper/ArrayTypeWrapper_ESTest.java: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/wrapper/ArrayTypeWrapper_ESTest.java uses unchecked or unsafe operations.
[WARNING] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/wrapper/ArrayTypeWrapper_ESTest.java: Recompile with -Xlint:unchecked for details.
[INFO] 2 warnings 
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/TypeImpl_ESTest.java:[26,29] TypeImpl(java.lang.Class<?>,java.lang.Class<?>) has private access in com.zappos.json.util.TypeImpl
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[43,55] cannot find symbol
  symbol:   class MyAnnotation
  location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[52,28] reference to hasAnnotation is ambiguous
  both method hasAnnotation(java.lang.reflect.Field,java.lang.Class<? extends java.lang.annotation.Annotation>) in com.zappos.json.util.Reflections and method hasAnnotation(java.lang.reflect.Method,java.lang.Class<? extends java.lang.annotation.Annotation>) in com.zappos.json.util.Reflections match
[INFO] 3 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.152 s
[INFO] Finished at: 2025-12-09T22:35:42-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/TypeImpl_ESTest.java:[26,29] TypeImpl(java.lang.Class<?>,java.lang.Class<?>) has private access in com.zappos.json.util.TypeImpl
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[43,55] cannot find symbol
[ERROR]   symbol:   class MyAnnotation
[ERROR]   location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[52,28] reference to hasAnnotation is ambiguous
[ERROR]   both method hasAnnotation(java.lang.reflect.Field,java.lang.Class<? extends java.lang.annotation.Annotation>) in com.zappos.json.util.Reflections and method hasAnnotation(java.lang.reflect.Method,java.lang.Class<? extends java.lang.annotation.Annotation>) in com.zappos.json.util.Reflections match
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
