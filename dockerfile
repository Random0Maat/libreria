FROM openjdk:19-alpine AS builder

EXPOSE 8080

ADD ./target/librerias-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
