FROM openjdk:8-jdk-alpine
ARG JAR_FILE=out/artifacts/spring_boot_ci_template_jar/*.jar
COPY ${JAR_FILE} app.jar
ENV PORT 5000
EXPOSE $PORT
CMD [ "sh", "-c", "mvn -Dserver.port=${PORT} spring-boot:run" ]
ENTRYPOINT ["java","-jar","/app.jar"]