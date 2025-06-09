# Base image
FROM openjdk:17-jdk-alpine

# Add JAR file
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Run app
ENTRYPOINT ["java", "-jar", "/app.jar"]
