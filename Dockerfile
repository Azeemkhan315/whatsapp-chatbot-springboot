FROM openjdk:17-jdk-slim
WORKDIR /app
# Copy the jar file into the container
COPY target/*.jar app.jar
# Expose port 
EXPOSE 8080
# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
