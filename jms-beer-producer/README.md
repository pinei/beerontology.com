# JMS Beer Producer

A simple app that sends messages to a JMS Broker.

## ActiveMQ with Docker

Docker command to start a AtiveMQ container for testing purpose.

```
docker run --name='activemq' -it --rm -p 8161:8161 -p 61616:61616 -p 61613:61613 webcenter/activemq:latest
```

The account admin is "admin" and password is "admin". All settings is the default ActiveMQ's settings.

- The Apache ActiveMQ server will listens on port 61616 for incoming OpenWire commands. 
- The Web Console is on port 8161.
- 61613 is the default port of the Stomp brokers.

## Steps

1. Start ActiveMQ with docker command
2. Login to console with admin/admin
3. Create a queue named "beerQueue"
4. Start jms-beer-consumer
5. Start jms-beer-producer
6. Make a request to http://localhost:8080/skol

The producer will send a Beer message object to the consumer for each `/skol` request.

The consumer will marshal and print the message object.

```
Received <Skol Pilsen Skol>
```

## Cleaning

The webcenter/activemq occupies 250 MB. To remove the image, here is the docker command.

```
docker rmi webcenter/activemq
```

## References

- [Using JMS in Spring Boot](https://dzone.com/articles/using-jms-in-spring-boot-1)
- [Messaging with JMS](https://spring.io/guides/gs/messaging-jms/)