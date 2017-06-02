# Java EE 7 Application Demo with Kotlin & WildFly Swarm
Java EE 7 Application Demo with Kotlin & WildFly Swarm

## Build

    mvn clean package

## Run

    java -jar target/demo-swarm.jar

## Build and Run

    mvn wildfly-swarm:run

## Use

Access JSF Page and Register Text.

    http://localhost:8080

Access JAX-RS Resource then get registered text.

    http://localhost:8080/rest/bookstore
