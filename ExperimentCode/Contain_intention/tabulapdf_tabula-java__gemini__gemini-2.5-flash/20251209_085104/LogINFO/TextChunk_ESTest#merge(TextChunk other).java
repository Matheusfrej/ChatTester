original test path: /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ tabula ---
[INFO] skip non existing resourceDirectory /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[33,32] no suitable constructor found for TextElement(java.lang.String,float,float,float,float,float,int,float,java.lang.String,java.lang.String,int)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[50,32] no suitable constructor found for TextElement(java.lang.String,float,float,float,float,float,int,float,java.lang.String,java.lang.String,int)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[57,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[58,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[59,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[60,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[74,100] cannot find symbol
  symbol:   variable DELTA
  location: class technology.tabula.TextChunk_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[75,98] cannot find symbol
  symbol:   variable DELTA
  location: class technology.tabula.TextChunk_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[76,102] cannot find symbol
  symbol:   variable DELTA
  location: class technology.tabula.TextChunk_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[77,105] cannot find symbol
  symbol:   variable DELTA
  location: class technology.tabula.TextChunk_ESTest
[INFO] 10 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.880 s
[INFO] Finished at: 2025-12-09T09:26:14-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[33,32] no suitable constructor found for TextElement(java.lang.String,float,float,float,float,float,int,float,java.lang.String,java.lang.String,int)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[50,32] no suitable constructor found for TextElement(java.lang.String,float,float,float,float,float,int,float,java.lang.String,java.lang.String,int)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[57,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[58,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[59,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[60,38] incompatible types: possible lossy conversion from double to float
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[74,100] cannot find symbol
[ERROR]   symbol:   variable DELTA
[ERROR]   location: class technology.tabula.TextChunk_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[75,98] cannot find symbol
[ERROR]   symbol:   variable DELTA
[ERROR]   location: class technology.tabula.TextChunk_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[76,102] cannot find symbol
[ERROR]   symbol:   variable DELTA
[ERROR]   location: class technology.tabula.TextChunk_ESTest
[ERROR] /home/hsc/Documents/Masters/TAES1/ChatTester_gemini_2_5/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java:[77,105] cannot find symbol
[ERROR]   symbol:   variable DELTA
[ERROR]   location: class technology.tabula.TextChunk_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
