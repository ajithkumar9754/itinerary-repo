
The architecture consist of following services:

INFORMATION-SERVICE	
ITINERARY-API-GATEWAY	
ITINERARY-HYSTRIX-DASHBOARD	
ITINERARY-MANAGEMENT-SERVICE
REGISTRYSERVICE


Git pull

https://github.com/ajithkumar9754/itinerary-repo.git


Build and Run

Install Docker 
Install Maven

mvn clean install -DskipTests && docker-compose up --build

Technology stack used


Java 8 
Springboot  for Microservices 
Spring Security for secured Endpoints - Enabled spring security and used inline memory authentication . refer WebSecurityConfig.java for details

Swagger library for API documentation - Did some customization on top of default configurations of swagger, Please refer SwaggerConfig.java for details

SpringSlueth for distributed tracing Log will be consisting of TraceI and SpanId to track application logs which might be in different machines

Eureka for service registry and discovery - Centralized registry for all the services. all the services will be  attached to Eureka server as a client

Zulu gateway for API gateway will route all the incoming rquest to corresposning backend services

Docker for containerisation , create images for each components and used docker compose to manage all the docker containers . refer docker-compose.yml for details

Apache maven-3.6.0 -For build application

MySql database : MySQL  used as the database for the application. Used mysql docker images to configure database

Liquibase librray to manage dataabase management, like database and table creation based on the liquibase configuration files. Enabled liquibase forspringboot. Please refer liquibase folder in itinerary-management-service for the implementtation details.


FeignClient - is used for micro-service to micro-service communication(INFORMATION-SERVICE	 --> ITINERARY-MANAGEMENT-SERVICE service calls)




Once application is UP and running with below command

mvn clean install -DskipTests && docker-compose up --build

Please verify the Eureka server to confirm all the services UP and Running with URL

http://localhost:8761/

Application	Name                PORT 
INFORMATION-SERVICE	            8085
ITINERARY-API-GATEWAY	        9090
ITINERARY-MANAGEMENT-SERVICE	8081


If All the services are UP 

Please use Swagger UI for API reference

We have 2 services 

1 . ITINERARY-MANAGEMENT-SERVICE  ---> http://localhost:8081/swagger-ui.html#/travel-management-controller   --> admin users
2. INFORMATION-SERVICE	          ---> http://localhost:8085/swagger-ui.html#/travel-information-controller  --> travelUser


Please note ITINERARY-MANAGEMENT-SERVICE endpoints are restricted to 'admin' users . so please use the required  token for the same.

From swagger UI we  can able to invoke API's. Please use the poroper data to invoke. Please refer the user guide .


Future improvement ( Please note because of time contraint I couldn't able to implement few items below)

Spring Client config with docker. Tried to implement it, But having some issues with container to container communication- Disabled the faeture in this app

Spring Securiry with oAuth2- We can integrate spring security with OAuth2. It will give security for applications, with token validity and all

Central logging mechanism for the docker based applications with logback.xml configurations

Regarding the security we can use java vulnerablity libraries to scan request and responses.

SSL intregation in docker container

Data encryption in the database while saving and decryption while retrieval







