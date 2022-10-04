package tests.day21;

import Pages.AmazonPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {

        //hepsiburada
        Driver.getDriver().get("https://hepsiburada.com");

        //ve sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");

        //sayfayi kapatin
        Driver.closeDriver();

    }


    @Test
    public void test02() throws IOException {

        //amazon sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));

        //nutella aratiniz
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //arama sonuc yazisini Webelementinin resmini aliniz
        ReusableMethods.getScreenshotWebElement("aramaSonucWE",amazonPage.aramaSonucElementi);

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
