import org.junit.Assert;
import org.junit.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class CheckoutTests extends BaseTest{
    @Test
    public void verifyCheckoutProcedure(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        homepage.clickOnCartButton();
        Assert.assertTrue(homepage.sauceLabsBackPackIsDisplayed());
        CheckoutPage checkoutPage = new CheckoutPage(DriverManager.getDriver().driver);
        checkoutPage.clickOnCheckoutButton();
        checkoutPage.setFirstNameTextBox("Mauricio");
        checkoutPage.setLastNameTextBox("Angulo");
        checkoutPage.setPostalCodeTextBox("0000");
        checkoutPage.clickOnContinueButton();
        Assert.assertTrue(homepage.sauceLabsBackPackIsDisplayed());
        checkoutPage.clickOnFinishButton();
        Assert.assertTrue(checkoutPage.checkoutIconIsDisplayed());
    }

    @Test
    public void emptyInformationCredentials(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnCartButton();
        CheckoutPage checkoutPage = new CheckoutPage(DriverManager.getDriver().driver);
        checkoutPage.clickOnCheckoutButton();
        checkoutPage.clickOnContinueButton();
        Assert.assertEquals("Error: First Name is required",
                checkoutPage.getCheckoutInformationErrorMessage());
        checkoutPage.setFirstNameTextBox("Mauricio");
        checkoutPage.clickOnContinueButton();
        Assert.assertEquals("Error: Last Name is required",
                checkoutPage.getCheckoutInformationErrorMessage());
        checkoutPage.setLastNameTextBox("Angulo");
        checkoutPage.clickOnContinueButton();
        Assert.assertEquals("Error: Postal Code is required",
                checkoutPage.getCheckoutInformationErrorMessage());

    }
}
