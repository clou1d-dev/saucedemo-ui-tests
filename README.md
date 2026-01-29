# SauceDemo UI Tests

UI автотесты для страницы логина https://www.saucedemo.com/

## Стек
- Java 17
- Selenium WebDriver
- JUnit 5
- Maven
- Allure

## Реализованные тесты
- Логин с пустыми полями
- Логин с неверным паролем
- Логин заблокированным пользователем
- Успешный логин
- Логин пользователя со сбоем производительности

## Запуск тестов
```bash
mvn clean test
## **Запуск отчета**
```bash
allure serve target/allure-results 
