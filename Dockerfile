FROM openjdk:8
COPY target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8079
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]