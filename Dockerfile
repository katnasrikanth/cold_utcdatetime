FROM openjdk:8
EXPOSE 8094
ADD target/cold-energy-ecoren.jar cold-energy-ecoren.jar
ENTRYPOINT ["java","-jar","/cold-energy-ecoren.jar"]
