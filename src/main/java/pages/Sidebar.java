package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sidebar {
    WebDriver driver;

    @FindBy(id = "react-burger-menu-btn")
    WebElement sidebarButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;

    public Sidebar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSidebarButton() { sidebarButton.click(); }
    public void clickOnLogoutButton() { logoutButton.click(); }

}
