package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Auto21 {
    @Test
    public void test(){
        /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Click on 'View Product' button
6. Verify 'Write Your Review' is visible
7. Enter name, email and review
8. Click 'Submit' button
9. Verify success message 'Thank you for your review.'
         */
        AutomationPage automationPage = new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        automationPage.productButton.click();
        Assert.assertTrue(automationPage.allProducts.isDisplayed());
        automationPage.viewCartProduct2.click();
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.writeYourReview);
        Assert.assertTrue(automationPage.writeYourReview.isDisplayed());
        automationPage.reviewYourName.sendKeys("Omer");
        automationPage.reviewEmail.sendKeys("omer@gmail.com");
        automationPage.reviewTextArea.sendKeys("Gracias por todos...");
        automationPage.reviewButton.click();

        Assert.assertTrue(automationPage.thaksYourReview.isDisplayed());

        Driver.closeDriver();










    }
}
