FROM openjdk:8
MAINTAINER data.integrity@outlook.com
RUN mkdir -p /restfulapi
WORKDIR /restfulapi
EXPOSE 8080
ADD ./target/restful-1.0-SNAPSHOT.jar ./
CMD java -jar restful-1.0-SNAPSHOT.jar
