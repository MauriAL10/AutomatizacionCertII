import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class LoginTest extends BaseTest {
    /*
    @Test
    public void loginSuccessTest(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        Assert.assertTrue(homepage.appLogoIsDisplayed());
    }

    @Test
    public void loginWithInvalidCredentialsTest(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("wrongPassword");
        loginPage.clickOnLoginButton();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
                loginPage.getLoginErrorMessage());
    }

     */
}
