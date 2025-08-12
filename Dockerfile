FROM eclipse-temurin:21-jdk
COPY target/MySpringBootApp-0.0.1-SNAPSHOT.jar MySpringBootApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/MySpringBootApp-0.0.1-SNAPSHOT.jar"]
