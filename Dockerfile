FROM maven:3-jdk-8-alpine

ADD app /usr/local/app

WORKDIR /usr/local/app
RUN mvn -Dmaven.test.skip=true clean package

ENTRYPOINT ["java","-jar","/usr/local/app/target/personas.jar"]
