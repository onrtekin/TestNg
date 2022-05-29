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

    @FindBy(xpath="//*[text()='Category']")
    public WebElement category;

    @FindBy(xpath="(//span[@class='badge pull-right'])[1]")
    public WebElement womenCategory;

    @FindBy(xpath="(//span[@class='badge pull-right'])[2]")
    public WebElement menCategory;

    @FindBy(xpath="(//span[@class='badge pull-right'])[3]")
    public WebElement kidsCategory;

    @FindBy(xpath="//*[text()='Dress ']")
    public WebElement dressWomenCategory;

    @FindBy(xpath="//div[@class='panel-body']//li[2]")
    public WebElement topsWomenCategory;

    @FindBy(xpath="//div[@class='panel-body']//li[3]")
    public WebElement sareeWomenCategory;

    @FindBy(xpath="//div[@class='left-sidebar']")
    public WebElement categoryPage;

    @FindBy(xpath="//*[text()='Women - Dress Products']")
    public WebElement womenDressProduct;

    @FindBy(xpath="//*[text()='Tshirts ']")
    public WebElement tshirtMenCategory;

    @FindBy(xpath="//div[@id='Men']//li[2]")
    public WebElement jeansMenCategory;

    @FindBy(xpath="//*[text()='Men - Tshirts Products']")
    public WebElement menTshirtProduct;

    @FindBy(xpath="//*[text()=' Products']")
    public WebElement productButton;

    @FindBy(xpath="//div[@class='brands-name']")
    public WebElement brands;

    @FindBy(xpath="//*[text()='Polo']")
    public WebElement polo;

    @FindBy(xpath="//div[@class='features_items']")
    public WebElement brandsPoloProducts;

    @FindBy(xpath="//*[text()='H&M']")
    public WebElement HM;

    @FindBy(xpath="//div[@class='features_items']")
    public WebElement brandsHMProducts;










}
