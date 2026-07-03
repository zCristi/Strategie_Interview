Strategie Interview – QA Automation Assessment
Overview

This repository contains my solution for the QA Automation Assessment.

The project automates the testing of the user profile registration page using Playwright for Java and follows the Page Object Model (POM) design pattern to ensure maintainability and scalability.

The repository also includes the required QA documentation:

Test Plan
Test Cases
Bug Report
Performance Report
Technology Stack
Java 21
Playwright for Java
JUnit 5
Maven
GitHub Actions (CI)
Project Structure
Strategie_Interview
│
├── docs
│   ├── Test Plan.xlsx
│   ├── Test Cases.xlsx
│   ├── Bug Report.xlsx
│   └── Performance Report.xlsx
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.strategie.interview
│   │           └── pages
│   │               └── RegistrationPage.java
│   │
│   └── test
│       └── java
│           └── com.strategie.interview
│               ├── base
│               │   └── BaseTest.java
│               │
│               └── tests
│                   └── RegistrationTests.java
│
├── .github
│   └── workflows
│       └── ci.yml
│
├── pom.xml
├── README.md
└── .gitignore
Prerequisites

Before running the project, ensure the following software is installed:

Java 21 (or Java 17)
Maven 3.9+
Git
Visual Studio Code (or IntelliJ IDEA)
Installation

Clone the repository:

git clone <repository-url>

Navigate to the project:

cd Strategie_Interview

Install dependencies:

mvn clean install

Install the Playwright browsers:

mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
Running the Tests

Run all automated tests:

mvn test

Run a specific test class:

mvn -Dtest=RegistrationTests test

Run a specific test method:

mvn -Dtest=RegistrationTests#successfulRegistration test
Framework Design

The automation framework follows the Page Object Model (POM).

BaseTest handles browser initialization and cleanup.
RegistrationPage encapsulates page locators and user interactions.
RegistrationTests contains the test scenarios and assertions.

This separation improves readability, maintainability, and code reuse.

Continuous Integration

A GitHub Actions workflow is configured to:

Build the Maven project
Install Playwright browsers
Execute the automated tests
Generate test reports

The workflow is triggered automatically on every push and pull request to the main branch.

Known Issues

The following issue was identified during testing and documented in the Bug Report:

The Confirm Password field displays entered characters in plain text instead of masking them as a password field.
Future Improvements

If additional development time were available, I would enhance the framework by:

Externalizing test data into JSON or CSV files
Supporting cross-browser execution (Chromium, Firefox, WebKit)
Generating HTML reports using Allure or Extent Reports
Adding screenshot and trace capture for failed tests
Executing tests in parallel to reduce execution time
