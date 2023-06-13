Start ZooKeeper :-
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka Server :-
.\bin\windows\kafka-server-start.bat .\config\server.properties

Start Producer :-
kafka-console-producer.bat --bootstrap-server localhost:9092 --prabhat

Start Consumer :-
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic prabhat --from-beginning