package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(className = "app_logo")
    WebElement appLogo;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement sauceLabsBackPackAddToCartButton;

    @FindBy(className = "shopping_cart_link")
    WebElement cartButton;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement sauceLabsBackPack;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean appLogoIsDisplayed() {
        boolean appLogoIsDisplayed = appLogo.isDisplayed();
        return appLogoIsDisplayed;
    }

    public boolean sauceLabsBackPackIsDisplayed(){
        boolean slbpIsDisplayed = sauceLabsBackPack.isDisplayed();
        return  slbpIsDisplayed;
    }

    public String getCartIconText(){
        String cartText = cartIcon.getText();
        return cartText;
    }

    public void clickOnAddSauceLabsBackPackToCartButton(){
        sauceLabsBackPackAddToCartButton.click();
    }
    public void clickOnCartButton(){ cartButton.click(); }
}
