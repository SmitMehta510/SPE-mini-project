FROM ubuntu:latest
EXPOSE 8080
RUN apt-get update && \
    apt-get install -y openjdk-17-jre
ADD target/scientific_calculator.jar scientific_calculator.jar
ENTRYPOINT ["java","-jar","/scientific_calculator.jar"]