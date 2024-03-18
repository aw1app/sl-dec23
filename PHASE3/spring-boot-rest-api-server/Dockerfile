# Stage 1: Build the custom base image with OpenJDK and Maven
FROM debian:latest AS custom-base

# Install OpenJDK, Maven, and essential utilities
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk-headless maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set JAVA_HOME environment variable
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

# Optionally, set PATH environment variable to include JDK and Maven binaries
ENV PATH="${JAVA_HOME}/bin:/usr/share/maven/bin:${PATH}"

# Stage 2: Build the Spring Boot application
FROM custom-base AS builder

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Stage 3: Create a custom image with MySQL installed
FROM mysql:latest

# Set MySQL root user password (change as needed)
ENV MYSQL_ROOT_PASSWORD=rootroot

# Copy the built JAR file from the builder stage to the MySQL image
COPY --from=builder /app/target/spring-boot-rest-api-server-0.0.1-SNAPSHOT.jar /spring-boot-rest-api-server-0.0.1-SNAPSHOT.jar

# Copy the script to start both MySQL and Spring Boot app
COPY start.sh /start.sh

# Set execute permission on the script
RUN chmod +x /start.sh

# Expose MySQL default port
EXPOSE 3306

# Start MySQL and Spring Boot app using the script
CMD ["/start.sh"]