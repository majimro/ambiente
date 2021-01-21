FROM openjdk:8u275-jdk-oracle
WORKDIR /
ADD target/ambiente-1.0.jar ambiente.jar
CMD java -jar ambiente.jar 

