#!/bin/bash

# Start MySQL service
service mysql start

# Start the Spring Boot application
java -jar /spring-boot-rest-api-server-0.0.1-SNAPSHOT.jar
