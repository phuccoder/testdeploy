FROM maven:3.8.4-openjdk-11-slim AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim
ADD ./demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]