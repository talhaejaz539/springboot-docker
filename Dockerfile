# First stage: build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Second stage: run the application
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/DataContainerApp.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]
