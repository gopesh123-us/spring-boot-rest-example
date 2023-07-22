FROM openjdk:17
LABEL maintainer ="springbootrestapi"
ADD target/spring-boot-rest-example-1.0-SNAPSHOT.jar spring-boot-rest-example-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-boot-rest-example-1.0-SNAPSHOT.jar"]