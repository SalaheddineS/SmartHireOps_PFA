# Stage 1: Build with Maven
FROM maven:3.8.4-openjdk-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package

# Stage 2: Create the final image
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/gateway-service-0.0.1-SNAPSHOT.jar /app/gateway-service-0.0.1-SNAPSHOT.jar
ENV SERVER_PORT=9999
ENV SPRING_APPLICATION_NAME=gateway-service
ENV SPRING_CLOUD_CONSUL_DISCOVERY_HOSTNAME=127.0.0.1
ENV SPRING_CLOUD_CONSUL_PORT=8500
CMD ["java", "-jar", "gateway-service-0.0.1-SNAPSHOT.jar"]
