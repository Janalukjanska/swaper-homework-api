## Overview

This project is a sample application demonstrating the use of Rest Assured for API testing. It includes:
- Authentication with an API
- Checking user balance
- Configuring API requests and responses
- Using Cucumber for behavior-driven development (BDD)

## Project Structure

- **`src/test/java/clients/SwaperClient.java`**: Contains methods for interacting with the API.
- **`src/test/java/stepDefinitions/SwaperSteps.java`**: Contains Cucumber step definitions that interact with the API.
- **`src/test/java/config/Constants.java`**: Store neccessary values for testing.
- 
## Prerequisites

- Java 11 or higher
- Maven
- Git

## Setup

1. **Clone the repository:**

    ```
    git clone https://github.com/YourUsername/swaper-homework.git
    ```

2. **Build the project:**

    ```bash
    mvn clean install
    ```

3. **Run Tests:**

    ```bash
    mvn test
    ```

## Configuration

- **API Endpoint**: The base URL for the API is configured in `src/test/java/config/Constants.java`.
- **Credentials**: Provide the necessary API credentials (username and password) in `src/test/java/config/Constants.java`.
