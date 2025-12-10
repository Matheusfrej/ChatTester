original test path: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java
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
[INFO] Compiling 2 source files to /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[32,46] constructor JsonReaderInvoker in class com.zappos.json.JsonReaderInvoker cannot be applied to given types;
  required: com.zappos.json.ZapposJson,java.lang.Class<?>
  found: no arguments
  reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[33,47] constructor JsonReaderInvoker in class com.zappos.json.JsonReaderInvoker cannot be applied to given types;
  required: com.zappos.json.ZapposJson,java.lang.Class<?>
  found: no arguments
  reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[34,47] constructor JsonReaderInvoker in class com.zappos.json.JsonReaderInvoker cannot be applied to given types;
  required: com.zappos.json.ZapposJson,java.lang.Class<?>
  found: no arguments
  reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[35,18] JSON_READER_INVOKERS has private access in com.zappos.json.JsonReaderCodeGenerator
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[41,34] JSON_READER_INVOKERS has private access in com.zappos.json.JsonReaderCodeGenerator
[INFO] 5 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.468 s
[INFO] Finished at: 2025-12-08T03:57:13-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[32,46] constructor JsonReaderInvoker in class com.zappos.json.JsonReaderInvoker cannot be applied to given types;
[ERROR]   required: com.zappos.json.ZapposJson,java.lang.Class<?>
[ERROR]   found: no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[33,47] constructor JsonReaderInvoker in class com.zappos.json.JsonReaderInvoker cannot be applied to given types;
[ERROR]   required: com.zappos.json.ZapposJson,java.lang.Class<?>
[ERROR]   found: no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[34,47] constructor JsonReaderInvoker in class com.zappos.json.JsonReaderInvoker cannot be applied to given types;
[ERROR]   required: com.zappos.json.ZapposJson,java.lang.Class<?>
[ERROR]   found: no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[35,18] JSON_READER_INVOKERS has private access in com.zappos.json.JsonReaderCodeGenerator
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[41,34] JSON_READER_INVOKERS has private access in com.zappos.json.JsonReaderCodeGenerator
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
