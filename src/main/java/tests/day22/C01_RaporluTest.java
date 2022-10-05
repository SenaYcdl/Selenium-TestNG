package tests.day22;

import Pages.BrcPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01(){


        // -https://www.bluerentalcars.com/ adresine git
        extentTest=extentReports.createTest("Pozitif login","gecerli username ve password ile giris yapabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");

        //    -login butonuna bas
        BrcPage brcPage=new BrcPage();
        brcPage.ilkLogin.click();
        extentTest.info("Ilk kogin butonuna tiklandi");

        //    -test data user email: customer@bluerentalcars.com ,
        //    -test data password : 12345 dataları girip login e basın
        brcPage.email.sendKeys(ConfigReader.getProperty("userEmail"));
        extentTest.info("Gecerli mail girildi");
        brcPage.password.sendKeys(ConfigReader.getProperty("passw"));
        extentTest.info("Gecerli password girildi");
        brcPage.ikinciLogin.click();
        extentTest.info("Ikinci login butonuna basildi");

        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUsername= brcPage.kullaniciProfil.getText();
        String expectedUsername=ConfigReader.getProperty("name");
        Assert.assertEquals(expectedUsername,actualUsername);
        extentTest.pass("Sayfaya basarili bir sekilde giris yapildi");


        /*
Hatanin resmini RAPORDA görmek istersek  target altinda Rapor icinde yazdirilan resmin uzernie sag tiklayin --->
Open in --> uzerine gelin -->  Explorer tiklayin bilgisayardaki dosyaninzin icine yönleneceksiniz
oradan raporu cift tiklayin acilan yeni sayfada alta kucuk resim var uzerini tiklayin
ve karsimiza resim cikmis olacak .

 */


    }



}
