package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;

import java.security.Key;

public class Odev2_DepensOnMethod extends TestBaseBeforeClassAfterClass {

    /*

    Bir class oluşturun: DependsOnTest
https://www.amazon.com/ adresine gidin.
Test : Amazon ana sayfaya gittiginizi test edin
Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
arama yapin ve aramanizin gerceklestigini Test edin
Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
$16.83 oldugunu test edin

     */

    /*
    DepensOn method test methodlarinin calisma siralamasina karismaz
    sadece bagli oldugu testin sonucuna bakar
    test passed olmassa baglanan test hic calismaz yani ignore olur
     */

    SoftAssert softAssert=new SoftAssert();

    @Test (priority = -1)
    public void test01(){

        //https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com");
        softAssert.assertTrue(driver.getCurrentUrl().contains("amazon"));

    }

    @Test (dependsOnMethods = "test01")
    public void test02(){

        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella", Keys.ENTER);

        WebElement result=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(result.isDisplayed(),"Sonuc görüntülenemedi");


    }

    @Test (dependsOnMethods = "test02")
    public void test03(){

        //Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        //$16.83 oldugunu test edin

        driver.findElement(By.xpath("//*[@data-image-index='14']")).click();

        WebElement price=driver.findElement(By.xpath("//td[@class='a-color-secondary a-size-base a-text-right a-nowrap']"));
        String expectedPrice="$16.83";
        softAssert.assertTrue(price.getText().equals(expectedPrice),"Fiyat farklidir");

    }
}
