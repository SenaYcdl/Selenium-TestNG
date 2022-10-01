package tests.day17;

import Pages.AmazonPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.Driver;

import java.security.Key;

public class C05_AmazonPageClass {

    @Test
    public void test1(){

        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);


    }
}
