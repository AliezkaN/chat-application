FROM openjdk:18
MAINTAINER Oleh Nahorniak <nagornyak68@gmail.com>
EXPOSE 8080
ARG JAR_FILE=/target/chat-application-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} chat-application.jar
ENTRYPOINT ["java","-jar","/chat-application.jar"]