# Use OpenJDK 17
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy all files
COPY . .

# Build the project using Maven wrapper
RUN ./mvnw clean package

# Run the Spring Boot JAR
CMD ["java", "-jar", "target/whatsapp-chatbot-0.0.1-SNAPSHOT.jar"]