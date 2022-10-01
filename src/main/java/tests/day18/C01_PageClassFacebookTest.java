package tests.day18;

import Pages.FacebookPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_PageClassFacebookTest {

    /*
    https://www.facebook.com/ adresine gidin
POM’a uygun olarak email, sifre kutularini ve giris yap
butonunu locate edin
Faker class’ini kullanarak email ve sifre degerlerini
yazdirip, giris butonuna basin
Basarili giris yapilamadigini test edin
     */


    @Test
    public void test() {


        //   https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();

        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        Faker faker = new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.login.click();

        //Basarili giris yapilamadigini test edin
        //class="_9ay7"
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());


    }
}
