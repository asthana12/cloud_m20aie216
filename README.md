# cloud_m20aie216
Developed By: Anansha Asthana (M20AIE216)

Functionality Developed: GET API for getting all the data from Assignment Table in database. URL : {hostname}/assignments (GET)

Technologies Used: Java, Spring Boot, Jetty Server, H2 Database, Docker, Maven (for Dependency)

Commands to be used to run the application :
1. mvn install dockerfile:build
2. docker run -p 8080:8081 -t IITJCloudAssignment/IITJCloudAssignment

Steps Followed :

1. Created an Application after adding the required dependency in pom.xml. There dependency which was added: Spring Boot V2.5.4, Java8, H2 Database, Jetty Server, Maven Plugin, Docker Plugin, Plugin to extract application as Jar File.

2. Developed Controller and Service Layer for Assignment API. Using inbuilt H2 which is created on run time using schema.sql and data.sql
Used another SQL to get data in the service layer which is returned as JSON response.

3. API returns an error if there is a problem in connecting to the database.

4. mvn clean install runs packaging of application which bring out a jar file in the target folder.

5. Dockerfile added which will be having a set of commands to package and run the application on Jetty Server.