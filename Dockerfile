FROM maven:3.8.5-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:17-alpine3.14
COPY --from=build /usr/src/app/target/ambiente-1.0.jar /usr/app/ambiente-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/ambiente-1.0.jar"]
