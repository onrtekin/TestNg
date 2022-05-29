package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Auto18 {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that categories are visible on left side bar
4. Click on 'Women' category
5. Click on any category link under 'Women' category, for example: Dress
6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
7. On left side bar, click on any sub-category link of 'Men' category
8. Verify that user is navigated to that category page
     */
    @Test
    public void test() throws InterruptedException {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();

        AutomationPage automationPage=new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        Assert.assertTrue(automationPage.category.isDisplayed());

        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.womenCategory);
        jse.executeScript("arguments[0].click();",automationPage.womenCategory);
        Thread.sleep(1000);

        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.dressWomenCategory);
        jse.executeScript("arguments[0].click();",automationPage.dressWomenCategory);


        Assert.assertTrue(automationPage.womenDressProduct.isDisplayed());
        automationPage.menCategory.click();
        automationPage.tshirtMenCategory.click();
        Assert.assertTrue(automationPage.menTshirtProduct.isDisplayed());
        Driver.closeDriver();


    }
}
