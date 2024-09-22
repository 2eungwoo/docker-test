FROM openjdk:17
VOLUME /tmp
COPY build/libs/docker-practice-0.0.1-SNAPSHOT.jar docker-practice.jar
EXPOSE 9201
ENTRYPOINT ["java","-jar","docker-practice.jar"]