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
docker run --name rabbitmq_container -p 15672:15672 -p 5672:5672 -p 61613:61613 rabbit 
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

## Spring WebSocket Chat
![1](https://user-images.githubusercontent.com/84874469/212544962-23ffe5b7-d85a-40a0-aa02-c67b4e41ca9c.jpg)
![2](https://user-images.githubusercontent.com/84874469/212544978-318082f3-1c68-4d5c-acf3-6752fd91ecdf.jpg)
![3](https://user-images.githubusercontent.com/84874469/212544984-cd5029e6-e543-4863-bbdc-fb8ad94bb3fe.jpg)
![4](https://user-images.githubusercontent.com/84874469/212544988-245500eb-b359-4c55-8940-4bda08300bb7.jpg)
![5](https://user-images.githubusercontent.com/84874469/212544994-49afa816-9021-47aa-9b99-02d2d0bde7b0.jpg)
![6](https://user-images.githubusercontent.com/84874469/212544998-cac7b59e-8cfd-47b2-a15b-522faca0c6b4.jpg)
![7](https://user-images.githubusercontent.com/84874469/212545003-6fe83b80-81df-4acf-9238-d41e6e84cac2.jpg)
