FROM openjdk:11
EXPOSE 8081
ADD target/spring-ms-one.jar ms-one-docker.jar
ENTRYPOINT ["java", "-jar", "/ms-one-docker.jar"]