FROM openjdk:11
RUN apt-get install tar
COPY target/*.jar /usr/local/lib/helloworld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/helloworld-0.0.1-SNAPSHOT.jar"]