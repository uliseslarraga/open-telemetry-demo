FROM eclipse-temurin:17-jre-alpine

COPY target/price-service-1.0.0-SNAPSHOT.jar price-service.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/price-service.jar"]