mvn package
pkill -f json2job-1.0-SNAPSHOT.jar
java -jar target/json2job-1.0-SNAPSHOT.jar -i bleh --server-mode --ssl-mode --log-file target/logs.txt -sp 7000 -st