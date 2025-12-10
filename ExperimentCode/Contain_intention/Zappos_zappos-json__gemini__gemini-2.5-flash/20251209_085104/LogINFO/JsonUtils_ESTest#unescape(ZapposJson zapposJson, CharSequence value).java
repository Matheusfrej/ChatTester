original test path: /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/JsonUtils_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -----------------------< com.zappos:zappos-json >-----------------------
[INFO] Building zappos-json 0.1-alpha
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- enforcer:1.4.1:enforce (enforce-java) @ zappos-json ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ zappos-json ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ zappos-json ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ zappos-json ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ zappos-json ---
[INFO] Changes detected - recompiling the module! :source
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 4 source files with javac [debug target 8] to target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[30,46] cannot find symbol
  symbol: variable value
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[35,1] constructor JsonReaderCodeGenerator in class com.zappos.json.JsonReaderCodeGenerator cannot be applied to given types;
  required: com.zappos.json.ZapposJson,com.zappos.json.JsonBeanIntrospector
  found: no arguments
  reason: actual and formal argument lists differ in length
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/JsonUtils_ESTest.java:[35,44] cannot find symbol
  symbol:   variable zapposJson
  location: class com.zappos.json.util.JsonUtils_ESTest
[INFO] 3 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.298 s
[INFO] Finished at: 2025-12-09T10:13:33-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[30,46] cannot find symbol
[ERROR]   symbol: variable value
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[35,1] constructor JsonReaderCodeGenerator in class com.zappos.json.JsonReaderCodeGenerator cannot be applied to given types;
[ERROR]   required: com.zappos.json.ZapposJson,com.zappos.json.JsonBeanIntrospector
[ERROR]   found: no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/JsonUtils_ESTest.java:[35,44] cannot find symbol
[ERROR]   symbol:   variable zapposJson
[ERROR]   location: class com.zappos.json.util.JsonUtils_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
