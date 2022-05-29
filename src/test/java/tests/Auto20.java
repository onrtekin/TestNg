package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Auto20 {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Enter product name in search input and click search button
6. Verify 'SEARCHED PRODUCTS' is visible
7. Verify all the products related to search are visible
8. Add those products to cart
9. Click 'Cart' button and verify that products are visible in cart
10. Click 'Signup / Login' button and submit login details
11. Again, go to Cart page
12. Verify that those products are visible in cart after login as well
     */

    @Test
    public void test(){
        AutomationPage automationPage = new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        automationPage.productButton.click();
        Assert.assertTrue(automationPage.allProducts.isDisplayed());
        automationPage.searchProduct.sendKeys("tshirt");
        automationPage.searchProductButton.click();
        Assert.assertTrue(automationPage.searchProductResults.isDisplayed());
        automationPage.products1.click();
        automationPage.continueShopping.click();
        automationPage.products2.click();
        automationPage.continueShopping.click();
        automationPage.products3.click();
        automationPage.continueShopping.click();
        automationPage.products4.click();
        automationPage.continueShopping.click();
        automationPage.products5.click();
        automationPage.continueShopping.click();
        automationPage.products6.click();
        automationPage.continueShopping.click();
        automationPage.card.click();
        Assert.assertTrue(automationPage.cartPage.isDisplayed());
        automationPage.signupLoginButton.click();
        automationPage.newUserName.sendKeys("omer");
        automationPage.newUserEmail.sendKeys("omerf@gmail.com");
        automationPage.signUpButton.click();
        automationPage.card.click();
        Assert.assertTrue(automationPage.shoppingCartHome.isDisplayed());
        Driver.closeDriver();






    }
}
