package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Add products to cart
5. Click 'Cart' button
6. Verify that cart page is displayed
7. Click 'X' button corresponding to particular product
8. Verify that product is removed from the cart
 */

public class Auto17 {

    @Test
    public void test() throws InterruptedException {
        AutomationPage automationPage = new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        Assert.assertTrue(automationPage.homePage.isDisplayed());
        Driver.getDriver().findElement(By.xpath("//a[@data-product-id='2']")).click();
        automationPage.viewCart.click();
        Assert.assertTrue(automationPage.cartPage.isDisplayed());
        Driver.getDriver().findElement(By.xpath("//a[@class='cart_quantity_delete']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//p[@class='text-center'])[3]")).isDisplayed());


    }
}
