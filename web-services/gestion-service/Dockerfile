# Stage 1: Build with Maven
FROM maven:3.8.4-openjdk-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package

# Stage 2: Create the final image
FROM openjdk:17-jdk-alpine
WORKDIR /app
ENV SERVER_PORT=8085
ENV SPRING_APPLICATION_NAME=gestion-service
ENV SPRING_CLOUD_CONSUL_DISCOVERY_HOSTNAME=127.0.0.1
ENV SPRING_CLOUD_CONSUL_PORT=8500
ENV POSTGRES_URL=
ENV POSTGRES_USERNAME=
ENV POSTGRES_PASSWORD=
ENV MINIO_URL=
ENV MINIO_ACCESS_KEY=
ENV MINIO_SECRET_KEY=
ENV MINIO_BUCKET_NAME=
COPY --from=builder /app/target/gestion-service-0.0.1-SNAPSHOT.jar /app/gestion-service-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "gestion-service-0.0.1-SNAPSHOT.jar"]
