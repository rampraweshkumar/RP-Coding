FROM openjdk:8-jdk-alpine
LABEL maintainer="Nikhil Sharma"
VOLUME ["/config"]
EXPOSE 8080
ARG JAR_FILE=target/ip-server-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} ip-server.jar
ENTRYPOINT ["java","-Dspring.config.location=/config/application.properties","-jar","/ip-server.jar"]