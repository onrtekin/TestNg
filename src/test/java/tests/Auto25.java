package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Auto25 {

    @Test
    public void test(){
        /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down page to bottom
5. Verify 'SUBSCRIPTION' is visible
6. Click on arrow at bottom right side to move upward
7. Verify that page is scrolled up and 'Full-Fledged practice
website for Automation Engineers' text is visible on screen
         */
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        AutomationPage automationPage = new AutomationPage();

        Assert.assertTrue(automationPage.homePage.isDisplayed());
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.subscription);

        Assert.assertTrue(automationPage.subscription.isDisplayed());

        automationPage.upwardArrow.click();

        Assert.assertTrue(automationPage.practiceAE.isDisplayed());
        Driver.closeDriver();

















    }
}
