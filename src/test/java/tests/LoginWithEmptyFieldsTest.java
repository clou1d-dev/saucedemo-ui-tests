package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginWithEmptyFieldsTest extends BaseTest {

    @Test
    void loginWithEmptyFieldsTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.clickLogin();

        assertEquals(
                "Epic sadface: Username is required",
                loginPage.getErrorText()
        );
    }
}