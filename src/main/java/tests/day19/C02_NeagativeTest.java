package tests.day19;

import Pages.HotelMyCampPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NeagativeTest {
    /*
    1 ) Bir Class olustur : NegativeTest
2) Bir test method olustur NegativeLoginTest()
 https://www.hotelmycamp.com/ adresine git
login butonuna bas
test data username: manager1 ,  test data password : manager1!
Degerleri girildiginde sayfaya girilemedigini test et
     */

    @Test
    public void NegatifTest(){

        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HotelMyCampPage hmcPage = new HotelMyCampPage();


        //login butonuna bas
        hmcPage.login.click();

        //test data username: manager1 ,  test data password : manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPassword"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.hataliGiris.isDisplayed());


        Driver.closeDriver();



    }


}

