#!/bin/bash

# Create a data directory for MySQL
mkdir -p /var/lib/mysql-new

# Check if the MySQL data directory is empty
if [ ! -d "/var/lib/mysql/mysql" ]; then
    # Initialize MySQL data directory
    mysqld --initialize-insecure --user=mysql --datadir=/var/lib/mysql-new

    # Start MySQL
    mysqld --user=mysql --datadir=/var/lib/mysql-new &
else
    # Start MySQL
    mysqld --user=mysql --datadir=/var/lib/mysql-new &


# Set JAVA_HOME and add Java bin directory to PATH
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=/usr/lib/jvm/java-17-openjdk-amd64/bin:$PATH

# Wait for MySQL to start (adjust sleep duration as needed)
sleep 10

# Start the Spring Boot application
java -jar /spring-boot-rest-api-server-0.0.1-SNAPSHOT.jar