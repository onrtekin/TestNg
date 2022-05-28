package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//html[@lang='en']")
    public WebElement homePage;
    @FindBy(xpath="//*[text()='View Cart']")
    public WebElement viewCart;
    @FindBy(id="cart_items")
    public WebElement cartPage;
    @FindBy(xpath="//tbody")
    public WebElement product;




}
