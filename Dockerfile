FROM maven:3.8.7-openjdk-18 AS build

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

FROM amazoncorretto:17

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

# Expose the port the application will run on
EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]


# docker build -t nodex_backend .

# docker run -p 9090:9090 nodex_backend
