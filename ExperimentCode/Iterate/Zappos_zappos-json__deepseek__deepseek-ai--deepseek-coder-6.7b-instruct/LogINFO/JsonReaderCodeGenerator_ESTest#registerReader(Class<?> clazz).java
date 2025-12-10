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
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.065 s
[INFO] Finished at: 2025-12-07T01:12:34-02:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US

########## Test INFO ##########
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
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ zappos-json ---
[INFO] Surefire report directory: /home/mathe/mestrado/merge_and_code_review/projeto/ChatTester/Repos/Zappos_zappos-json/target/surefire-reports
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.338 s
[INFO] Finished at: 2025-12-07T01:12:36-02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project zappos-json: Unable to generate classpath: org.apache.maven.artifact.resolver.ArtifactResolutionException: Unable to get dependency information for org.apache.maven.surefire:surefire-junit4:jar:2.12.4: Failed to retrieve POM for org.apache.maven.surefire:surefire-junit4:jar:2.12.4: Could not transfer artifact org.apache.maven.surefire:surefire-junit4:pom:2.12.4 from/to central (https://repo.maven.apache.org/maven2): transfer failed for https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom
[ERROR]   org.apache.maven.surefire:surefire-junit4:jar:2.12.4
[ERROR] 
[ERROR] from the specified remote repositories:
[ERROR]   central (https://repo.maven.apache.org/maven2, releases=true, snapshots=false)
[ERROR] Path to dependency: 
[ERROR] 	1) dummy:dummy:jar:1.0: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
