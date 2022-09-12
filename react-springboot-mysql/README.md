
# React, Spring Boot(Hibernate) and MySQL webapp!


![Application Home page](https://cdn-images-1.medium.com/max/1000/1*H4KTKqkilycIb1ebhvN85w.png)


![List of all data in our React app](https://cdn-images-1.medium.com/max/1000/1*h8A68kGQpM6QoQYOCqux6g.png)

### Installation

#### Prerequisites

    maven
    npm
    JAVA


```sh
mvn clean package
java -jar target/springboot-0.0.1-SNAPSHOT.jar
```

### To run test cases 
    mvn clean test

### To Test

#### Frontend:
    https://testlab.fsd-mygreatlearning.net:8080

#### Backend:

GET

    curl --location --request GET 'https://testlab.fsd-mygreatlearning.net:8080/api/employee' \
    --header 'Content-Type: application/json'


POST

    curl --location --request POST 'https://testlab.fsd-mygreatlearning.net:8080/api/employee' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "name": "TestCurl2",
        "department": "Tech",
        "gender": "F",
        "dob": "1996-12-07"
    }'