# Test Automation Practice Framework

## Project Overview

This project is an end-to-end web automation testing framework developed using Selenium WebDriver, Java, TestNG, Maven, and Jenkins. The framework automates test scenarios for the Test Automation Practice website and generates detailed execution reports.

## Tech Stack

* Java 17
* Selenium WebDriver 4.21.0
* TestNG 7.11.0
* Maven
* WebDriverManager
* Extent Reports
* Apache POI
* Log4j
* Jenkins CI/CD

## Project Structure

```text
TestAutomationPractice
│
├── src/test/java
│   ├── com.test.automation
│   │   └── BaseTest.java
│   ├── POM
│   │   └── POM_Implementation.java
│   ├── Utilities
│   │   ├── ExtentManager.java
│   │   └── TestListener.java
│   └── Listener
│       └── Listenerclass.java
│
├── Reports
│   └── ExtentReport.html
│
├── Screenshot
│
├── test-output
│
├── testng.xml
├── pom.xml
└── JenkinsFile
```

## Features

* Page Object Model (POM) Design Pattern
* TestNG Test Execution
* Extent Report Integration
* Screenshot Capture on Failure
* Maven Build Management
* Jenkins Continuous Integration
* Cross-Browser Automation Support
* WebDriverManager Integration

## Prerequisites

Install the following before running the project:

* Java JDK 17
* Maven 3.x
* Eclipse IDE
* Google Chrome
* Git
* Jenkins (Optional)

## Clone Repository

```bash
git clone https://github.com/balatejj/CapstonRepos.git
```

## Import Project

1. Open Eclipse.
2. Select:
   File → Import → Existing Maven Projects.
3. Browse to the project folder.
4. Click Finish.

## Install Dependencies

```bash
mvn clean install
```

## Execute Tests

### Using Maven

```bash
mvn test
```

### Using TestNG

Run:

```text
testng.xml
```

as a TestNG Suite.

## Jenkins Pipeline

The project supports Jenkins Pipeline execution.

Pipeline Stages:

1. Checkout
2. Build
3. Compile
4. Test
5. Package

Run using:

```bash
mvn clean test
```

## Reports

### Extent Report

Generated at:

```text
Reports/ExtentReport.html
```

### TestNG Report

Generated at:

```text
test-output/index.html
```

## Screenshots

Failure screenshots are stored in:

```text
Screenshot/
```

## Author

Bala Teja Surla

## Version

1.0.0

## License

This project is developed for educational and automation testing practice purposes.
