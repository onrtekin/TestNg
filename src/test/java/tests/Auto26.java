package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Auto26 {

    @Test
    public void test() throws InterruptedException {
        /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down page to bottom
5. Verify 'SUBSCRIPTION' is visible
6. Scroll up page to top
7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
         */
        AutomationPage automationPage = new AutomationPage();
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        Assert.assertTrue(automationPage.homePage.isDisplayed());
        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.subscription);
        Thread.sleep(1000);
        Assert.assertTrue(automationPage.subscription.isDisplayed());
        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.practiceAE);
        Assert.assertTrue(automationPage.practiceAE.isDisplayed());
       Thread.sleep(1000);

        Driver.closeDriver();



    }
}
