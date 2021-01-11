# rest-book project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Commands

### First Hands on Quarkus

```shell script
./mvnw quarkus:dev

./mvnw test

curl http://localhost:8080/api/books
```

### Developing the Application

```shell script
mvn quarkus:dev

curl http://localhost:8080/api/books
curl http://localhost:8080/api/books/count
curl http://localhost:8080/api/books/1
```

### Testing the Application

```shell script
mvn test
```

### Configuring the Application

```shell script
mvn quarkus:dev
mvn quarkus:dev -Dbooks.genre=IT
mvn quarkus:dev -Dbooks.genre="Sci fi"

mvn test
mvn test -Dbooks.genre="Sci fi"

mvn quarkus:dev -Dquarkus.profile=staging
```

### Packaging the Application

```shell script
mvn package
mvn package -Dquarkus.package.type=jar
mvn package -Dquarkus.package.type=fast-jar
mvn package -Dquarkus.package.type=uber-jar

java -jar target/rest-book-runner.jar
```

```shell script
mvn package -Dquarkus.package.type=native
./target/rest-book-runner

mvn package -Dquarkus.package.type=native -Dquarkus.native.container-build=true
./target/rest-book-runner
/!\ error
```

```shell script
mvn verify -Pnative
```

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `rest-book-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/rest-book-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/rest-book-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

# RESTEasy JAX-RS

<p>A Hello World RESTEasy resource</p>

Guide: https://quarkus.io/guides/rest-json
