package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;


public class Auto22 {
    @Test

    public void test() throws InterruptedException {
        /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Scroll to bottom of page
4. Verify 'RECOMMENDED ITEMS' are visible
5. Click on 'Add To Cart' on Recommended product
6. Click on 'View Cart' button
7. Verify that product is displayed in cart page
         */
        AutomationPage automationPage = new AutomationPage();

        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

        Assert.assertTrue(automationPage.recommendedItems.isDisplayed());

        automationPage.productsRecommended.click();
        automationPage.viewCart.click();

        Assert.assertTrue(automationPage.cartInfo.isDisplayed());
        Driver.closeDriver();











    }




}
