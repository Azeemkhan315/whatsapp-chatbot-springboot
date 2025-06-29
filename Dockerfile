# Use official Java 17 image
FROM openjdk:17-jdk-slim

# Create app directory inside container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the port that the app will run on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
