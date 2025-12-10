original test path: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/ProjectionProfile_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ tabula ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ tabula ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 334 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/ProjectionProfile_ESTest.java:[31,9] no suitable method found for assertArrayEquals(float[],float[],double)
    method org.junit.Assert.assertArrayEquals(float[],float[],float) is not applicable
      (argument mismatch; possible lossy conversion from double to float)
    method org.junit.Assert.assertArrayEquals(double[],double[],double) is not applicable
      (argument mismatch; float[] cannot be converted to double[])
    method org.junit.Assert.assertArrayEquals(java.lang.String,long[],long[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
    method org.junit.Assert.assertArrayEquals(java.lang.String,int[],int[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
    method org.junit.Assert.assertArrayEquals(java.lang.String,short[],short[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
    method org.junit.Assert.assertArrayEquals(java.lang.String,char[],char[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
    method org.junit.Assert.assertArrayEquals(java.lang.String,byte[],byte[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
    method org.junit.Assert.assertArrayEquals(java.lang.String,boolean[],boolean[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
    method org.junit.Assert.assertArrayEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; float[] cannot be converted to java.lang.String)
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.025 s
[INFO] Finished at: 2025-12-08T03:13:53-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure
[ERROR] /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/ProjectionProfile_ESTest.java:[31,9] no suitable method found for assertArrayEquals(float[],float[],double)
[ERROR]     method org.junit.Assert.assertArrayEquals(float[],float[],float) is not applicable
[ERROR]       (argument mismatch; possible lossy conversion from double to float)
[ERROR]     method org.junit.Assert.assertArrayEquals(double[],double[],double) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to double[])
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,long[],long[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,int[],int[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,short[],short[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,char[],char[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,byte[],byte[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,boolean[],boolean[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertArrayEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; float[] cannot be converted to java.lang.String)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
