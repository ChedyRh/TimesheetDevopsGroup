FROM openjdk:8-jdk-alpine
EXPOSE 8086
ADD /target/Timesheet-1.0.jar Timesheet-1.0.jar
ENTRYPOINT ["java","-jar","Timesheet-1.0.jar"]
