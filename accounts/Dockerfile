# Base image (Java 17)
FROM eclipse-temurin:17-jdk-jammy

# Image metadata
LABEL maintainer="DishaNayak"

# Copy jar into image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
