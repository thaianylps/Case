# Antifraud Validation Engine

This project is a prototype antifraud validation engine built using Java Spring Boot. It provides a framework for validating transactions and assessing fraud risk.

## Project Structure

- **src/main/java/com/example/antifraud**: Contains the main application code.
  - **AntifraudValidationEngineApplication.java**: The entry point of the Spring Boot application.
  - **controller**: Contains controllers for handling HTTP requests.
    - **AntifraudController.java**: Manages antifraud operations.
  - **service**: Contains business logic for antifraud validation.
    - **AntifraudService.java**: Evaluates the risk of transactions.
  - **model**: Contains data structures for antifraud transactions.
    - **AntifraudModel.java**: Represents transaction data.

- **src/main/resources**: Contains application resources.
  - **application.properties**: Configuration properties for the application.
  - **static**: Directory for static resources (HTML, CSS, JS).

- **src/test/java/com/example/antifraud**: Contains unit tests for the application.
  - **AntifraudValidationEngineApplicationTests.java**: Tests for verifying application functionality.

- **mvnw**: Maven wrapper script for running Maven commands.
- **mvnw.cmd**: Windows version of the Maven wrapper script.
- **pom.xml**: Maven configuration file for project dependencies and build settings.

## Getting Started

To run the application, use the following command:

```
./mvnw spring-boot:run
```

Ensure you have Java and Maven installed on your machine.

## License

This project is licensed under the MIT License.