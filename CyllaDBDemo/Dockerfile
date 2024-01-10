FROM openjdk:8-jre-alpine
LABEL maintainer="praveen"
LABEL build_date="2023-09-01"
WORKDIR /app
COPY target/cylladb.jar .
EXPOSE 8080
CMD ["java", "-jar", "cylladb.jar"]