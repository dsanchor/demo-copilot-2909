# Spring Boot Rest API

## Build the project

```bash
mvn clean install
```

## Run the project

```bash
mvn spring-boot:run
```

## Test the project

```bash
curl -X GET http://localhost:8080/api/hello
```

## Test the reverse operation

```bash
curl -X GET http://localhost:8080/api/reverse?text=Hello
```

## Test junit

```bash
mvn test
```

## Containerize the application

```bash
docker build -t spring-boot-demo2909 .
```

## Run the application in a container

```bash
docker run -p 8080:8080 spring-boot-demo2909
```
