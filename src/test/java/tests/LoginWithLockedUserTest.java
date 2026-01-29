package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginWithLockedUserTest extends BaseTest {

    @Test
    void loginWithLockedUserTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        assertEquals(
                "Epic sadface: Sorry, this user has been locked out.",
                loginPage.getErrorText()
        );
    }
}
