import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.Sidebar;
import utilities.DriverManager;

public class SidebarTests extends BaseTest {

    @Test
    public void verifyLogoutClosesTheSession(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Sidebar sidebar = new Sidebar(DriverManager.getDriver().driver);
        sidebar.clickOnSidebarButton();
        sidebar.clickOnLogoutButton();
        Assert.assertTrue(loginPage.loginIconIsDisplayed());
    }
}
