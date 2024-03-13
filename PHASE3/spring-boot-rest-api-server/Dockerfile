# Stage 1: Build the Spring Boot application
FROM maven:3.8.3-openjdk-17-slim AS builder

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Stage 2: Create a custom image with MySQL installed
FROM mysql:latest

# Set MySQL root user password (change as needed)
ENV MYSQL_ROOT_PASSWORD=rootroot

# Copy the built JAR file from the builder stage to the MySQL image
COPY --from=builder /app/target/<your-spring-boot-app-name>.jar /<your-spring-boot-app-name>.jar

# Copy the script to start both MySQL and Spring Boot app
COPY start.sh /start.sh

# Grant execute permissions to the script
RUN chmod +x /start.sh

# Expose MySQL default port
EXPOSE 3306

# Start MySQL and Spring Boot app using the script
CMD ["/start.sh"]
