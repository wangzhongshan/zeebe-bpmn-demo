## build

mvn clean package

native-image --verbose --initialize-at-build-time --no-fallback --allow-incomplete-classpath --report-unsupported-elements-at-runtime -cp ./target/zeebe-bpmn-demo-1.0-SNAPSHOT.jar App ./target/app

## run

./target/app