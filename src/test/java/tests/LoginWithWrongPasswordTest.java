package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginWithWrongPasswordTest extends BaseTest {

    @Test
    void loginWithWrongPasswordTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("wrong_password");
        loginPage.clickLogin();

        assertEquals(
                "Epic sadface: Username and password do not match any user in this service",
                loginPage.getErrorText()
        );
    }
}
