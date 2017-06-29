#!/bin/bash
pkill -f json2job-1.0-SNAPSHOT-jar-with-dependencies.jar
cp target/json2job-1.0-SNAPSHOT-jar-with-dependencies.jar .
nohup java -jar json2job-1.0-SNAPSHOT-jar-with-dependencies.jar -i bleh --server-mode --ssl-mode --log-file /json2job_logs/logs.txt -sp 7000 -st &
#java -jar json2job-1.0-SNAPSHOT-jar-with-dependencies.jar -i bleh --server-mode --ssl-mode --log-file -sp 7000 -st /json2job_logs/logs.txt
