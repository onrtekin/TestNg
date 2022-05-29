package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;


public class Auto19 {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify that Brands are visible on left side bar
5. Click on any brand name
6. Verify that user is navigated to brand page and brand products are displayed
7. On left side bar, click on any other brand link
8. Verify that user is navigated to that brand page and can see products
     */
    @Test
    public void test(){

        AutomationPage automationPage = new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        automationPage.productButton.click();
        Assert.assertTrue(automationPage.brands.isDisplayed());
        automationPage.polo.click();
        Assert.assertTrue(automationPage.brandsPoloProducts.isDisplayed());
        automationPage.HM.click();
        Assert.assertTrue(automationPage.brandsHMProducts.isDisplayed());
        Driver.closeDriver();

    }
}
