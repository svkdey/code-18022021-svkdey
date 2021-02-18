echo "Running TEST script ===>"
mvn clean install;


echo "Running BUILD script ===>"
mvn assembly:assembly -DdescriptorId=jar-with-dependencies;


echo "Running APPLICATION script"
java -cp /Users/souvikdey/Test/greeter-junit-unittest/target/greeter-junit-unittest-0.0.1-SNAPSHOT-jar-with-dependencies.jar Main;