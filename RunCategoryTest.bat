javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar wc.java -encoding utf-8 -d .  --add-exports java.base/sun.security.util=ALL-UNNAMED  
javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar Filehandler.java -encoding utf-8 -d .  --add-exports java.base/sun.security.util=ALL-UNNAMED  

javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar wcTest.java -encoding utf-8 -d .  --add-exports java.base/sun.security.util=ALL-UNNAMED  
javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar filehandlerTest.java -encoding utf-8 -d .  --add-exports java.base/sun.security.util=ALL-UNNAMED  

javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar OneCategoryInterface.java  -encoding utf-8 -d .  --add-exports java.base/sun.security.util=ALL-UNNAMED  
javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar categorySuite.java -sourcepath . -encoding utf-8 -d .  --add-exports java.base/sun.security.util=ALL-UNNAMED  

java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CategorySuite

