FROM openjdk:8-jdk-alpine
mvn clean install

ARG RUN_FILE = target/IITJCloudAssignment 0.0.1-SNAPSHOT

COPY ${RUN_FILE} ASSIGNMENT_DOCKER_APP.jar

ENTRYPOINT ["java","-jar","ASSIGNMENT_DOCKER_APP.jar"]