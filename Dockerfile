# Use an official OpenJDK runtime as the base image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/martin-notifications-0.0.1-SNAPSHOT.jar /app/martin-notifications-0.0.1-SNAPSHOT.jar

# Expose the application port (default Spring Boot port is 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "martin-notifications-0.0.1-SNAPSHOT.jar"]