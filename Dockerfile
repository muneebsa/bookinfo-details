FROM openjdk:8-jdk-alpine
MAINTAINER muneebsa@yahoo.com
COPY target/bookinfo-details-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]