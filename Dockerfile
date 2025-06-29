FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/whatsapp-chatbot-0.0.1-SNAPSHOT.jar app.jar
# 4. Expose the port used by the application (important for Render)
EXPOSE 8080
# 5. Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
