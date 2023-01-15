## To check how chat works

## Steps to Setup
**1. Clone the application**
```ssh
git clone https://github.com/AliezkaN/chat-application.git
```
**2. Open project directory**

## First way to start application
* Run RabbitMQ in Docker container and start Spring Boot application:

```ssh
cd rabbit
docker build -t rabbit .
cd ..
mvn package
java -jar target/chat-application-0.0.1-SNAPSHOT.jar
```
* Inspite of using mwn package you can start spring boot applicatin in IDE*

## Second way to start application
* Run RabbitMQ and Application using docker-compose file:

```ssh
mvn package
docker compose build
docker compose up
```
