# Saucedemo UI Tests

Автоматизированные UI-тесты для проверки авторизации на сайте  
https://www.saucedemo.com/

##  Tech stack
- Java
- Selenium WebDriver
- JUnit 5
- Maven
- Allure Reports
- Page Object Model (POM)

##  Project structure
src
src
└── test
├── java
│   ├── pages        // Page Object classes
│   ├── tests        // Test classes
│   └── base         // Base test
└── resources        // Configuration files 


##  Test scenarios
- Successful login (standard_user)
- Login with wrong password
- Login with locked user
- Login with empty fields
- Login with performance_glitch_user (with wait for page loading)

## ▶ How to run tests
```bash
mvn clean test
📊 Allure report
After test execution, Allure results will be generated in:

target/allure-results
To open the report (if Allure CLI is installed):

allure serve target/allure-results
📌 Notes
Each test is independent

Page Object Model is used to separate test logic from UI logic

Project is managed via Git with separate dev and main branches