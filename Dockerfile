FROM openjdk:8-jdk-alpine

ARG RUN_JAR=target/iitjm20aie216-0.0.1-SNAPSHOT.jar

COPY ${RUN_JAR} iitjm20aie216-docker.jar

ENTRYPOINT ["java","-jar","iitjm20aie216-docker.jar"]