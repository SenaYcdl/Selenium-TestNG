package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C04_DepensOnMethod extends TestBaseBeforeClassAfterClass {

    @Test
    public void test1() {
        //amazon anasayfasina gidelim
        driver.get("https://www.amazon.com");

    }

    @Test (dependsOnMethods = "test1")
    public void test2() {
        //nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);

    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        //sonuc yazisinin amazon icerdigini test edelim
        //assert !driver.findElement(By.cssSelector("div[class=\"a-section a-spacing-small a-spacing-top-small\"]")).
                //getText().contains("amazon");

        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));

    }
}
