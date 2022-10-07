package tests.day23;

import Pages.BrcPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"sena@gmail.com", "12345"},{"yucedal@gmail.com", "123"},{"yuce@gmail.com","4567"}};
    }

    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {

        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        
        //login butonuna bas
        BrcPage brcPage=new BrcPage();
        brcPage.ilkLogin.click();
        
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        brcPage.email.sendKeys(userEmail);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.ENTER).perform();
        brcPage.ikinciLogin.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
    }
}