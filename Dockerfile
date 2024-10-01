FROM openjdk:24-ea-17-slim
WORKDIR /app
COPY target/*.jar /app/testeessia.jar
EXPOSE 8080
CMD ["java", "-jar", "testeessia.jar"]