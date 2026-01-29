package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    // protected — чтобы дочерние тесты могли пользоваться driver

    @BeforeEach
    void setUp() {
        // Этот метод выполняется ПЕРЕД КАЖДЫМ тестом

        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {

        if (driver != null) {
            driver.quit();

        }
    }
}
