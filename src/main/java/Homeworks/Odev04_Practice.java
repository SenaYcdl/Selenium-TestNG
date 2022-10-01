package Homeworks;

import Pages.SaucedemoPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Odev04_Practice{

     /*
//     * Navigate to  https://www.saucedemo.com/
//     * Enter the username  as standard_user
//     * Enter the password as   secret_sauce
//     * Click on login button
//     * Choose price low to high
//       and verify that PRICE (LOW TO HIGH) is visible
     */

    /*
    1-)once Pages package inde SaucedemoPage classi olusturduk ve PageFactory.initElements(Driver.getDriver(), this);
    methodu ile driver arasinda iliski kurarak locateleri aldik
    2-)sonra configuration.properties file inda Url ve istenen datalari girdik
    3_)daha sonra bu class da obje olusturduktan sonra SaucedemoPage inden ConfigReader.getProperty("") methodu
    kullanarak datalari cagirdik
    4-)ve son olarak da utilities package inden Driver classini kullanarak close yaptik
     */


    @Test
    public void test() {


        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
        SaucedemoPage saucedemoPage = new SaucedemoPage();


        //Enter the username  as standard_user
       //Enter the password as   secret_sauce
        saucedemoPage.username.sendKeys(ConfigReader.getProperty("user"));
        saucedemoPage.password.sendKeys(ConfigReader.getProperty("pass"));

       //Click on login button
        saucedemoPage.loginButton.click();

       //Choose price low to high
        //and verify that PRICE (LOW TO HIGH) is visible
        Select select=new Select(saucedemoPage.productSortContainer);
        select.selectByVisibleText("Price (low to high)");
        Assert.assertTrue(saucedemoPage.productSortContainer.isDisplayed());

        Driver.closeDriver();



    }

}
