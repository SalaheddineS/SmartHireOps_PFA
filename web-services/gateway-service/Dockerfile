# Use the official OpenJDK base image with Java 17
FROM openjdk:17-jdk-alpine
# Set the working directory inside the container
WORKDIR /app
# Copy the application JAR file into the container at the specified working directory
COPY target/gateway-service-0.0.1-SNAPSHOT.jar /app/gateway-service-0.0.1-SNAPSHOT.jar
# Set the environment variables
ENV SERVER_PORT=9999
ENV SPRING_APPLICATION_NAME=gateway-service
ENV SPRING_CLOUD_CONSUL_DISCOVERY_HOSTNAME=127.0.0.1
ENV SPRING_CLOUD_CONSUL_PORT=8500

# Specify the command to run your application
CMD ["java", "-jar", "gateway-service-0.0.1-SNAPSHOT.jar"]
