# latest oracle openjdk is the basis
FROM openjdk:oracle
# copy jar file into container image under app directory
COPY target/JavaCIDemoIntercorp-1.0.0.jar app/JavaCIDemoIntercorp-1.0.0.jar
# expose server port accept connections
EXPOSE 8084
# start application
CMD ["java", "-jar", "app/JavaCIDemoIntercorp-1.0.0.jar"]