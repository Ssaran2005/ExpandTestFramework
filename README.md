# ExpandTestFramework

## Project Overview

ExpandTestFramework is a Selenium Automation Testing Framework developed using:

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Extent Reports
* GitHub

This framework automates web application testing using reusable components and professional framework design.

---

# Features Implemented

## Framework Features

* Maven Project Structure
* Selenium WebDriver Integration
* TestNG Framework
* Page Object Model (POM)
* BasePage Reusable Methods
* Explicit Wait Utilities
* Screenshot Capture Utility
* TestNG Listeners
* Extent HTML Reports
* GitHub Version Control
* testng.xml Suite Execution

---

# Project Structure

```text
src
 ├── main
 │    ├── java
 │    │    ├── base
 │    │    ├── pages
 │    │    ├── utils
 │    │    └── listeners
 │    │
 │    └── resources
 │         └── config.properties
 │
 └── test
      └── java
           ├── base
           ├── tests
           └── listeners
```

---

# Technologies Used

| Technology     | Purpose              |
| -------------- | -------------------- |
| Java           | Programming Language |
| Selenium       | Browser Automation   |
| TestNG         | Test Execution       |
| Maven          | Build Management     |
| Extent Reports | HTML Reporting       |
| GitHub         | Version Control      |

---

# Test Execution

## Run Tests

```bash
mvn test
```

## Run Using TestNG Suite

```bash
mvn test "-DsuiteXmlFile=testng.xml"
```

---

# Reports

Extent HTML Report Location:

```text
reports/ExtentReport.html
```

Screenshots Location:

```text
screenshots/
```

---

# Implemented Test Cases

## Login Module

* Valid Login Test
* Login Success Validation
* Failure Screenshot Capture

---

# GitHub Repository

Repository successfully integrated with GitHub for version control and project management.

---

# Future Enhancements

* Cross Browser Testing
* Data Driven Testing
* Jenkins CI/CD Integration
* API Testing Integration
* Docker Support

---

# Author

Saran S
