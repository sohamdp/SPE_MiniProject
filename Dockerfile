FROM openjdk
COPY ./target/MiniProject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","MiniProject-1.0-SNAPSHOT.jar","org/example/Calculator"]