FROM openjdk:8-jdk-alpine
ADD app/target/personas.jar personas.jar
ENTRYPOINT ["java","-jar","personas.jar"]
