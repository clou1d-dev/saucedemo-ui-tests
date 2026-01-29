package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Локатор любого элемента, который есть ТОЛЬКО на странице товаров
    private By productsTitle = By.className("title");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Проверяем, что страница товаров открылась
    public boolean isOpened() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(productsTitle)
        ).isDisplayed();
    }
}
