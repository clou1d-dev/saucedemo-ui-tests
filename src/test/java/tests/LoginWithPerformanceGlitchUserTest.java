package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginWithPerformanceGlitchUserTest extends BaseTest {

    @Test
    void loginWithPerformanceGlitchUserTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.open();
        loginPage.enterUsername("performance_glitch_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        assertTrue(productsPage.isOpened());
    }
}
