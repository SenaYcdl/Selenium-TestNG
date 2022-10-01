package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Odev3_SoftAsssert extends TestBaseBeforeClassAfterClass {

    /*
    Yeni bir Class Olusturun : C03_SoftAssert
1. “http://zero.webappsecurity.com/” Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password” yazin
5. Sign in tusuna basin
6. Online banking menusu icinde Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"

 */

    @Test
    public void test(){

        // “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();

        //3. Login kutusuna “username” yazin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");

        //4. Password kutusuna “password” yazin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");

        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();


        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id='online-banking']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();

        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();

        //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement drop=driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select=new Select(drop);
        select.selectByVisibleText("Eurozone (euro)");

        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        String option=select.getFirstSelectedOption().getText();
        String expectedOption="Eurozone (Euro)";
        softAssert.assertEquals(option, expectedOption, "Secilen option dogru degil");

        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin "Select One",
        List<WebElement> dropDownList = select.getOptions();
        List<String> actualList = new ArrayList<>();
        for (WebElement w:dropDownList) {
            actualList.add(w.getText());
        }
        List<String> dropDownElement = new ArrayList<>(Arrays.asList("Select One","Australia (dollar)",
                "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)",
                "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)",
                "Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"));
        Collections.sort(dropDownElement);
        Collections.sort(actualList);
        softAssert.assertEquals(actualList,dropDownElement,"uyusmazlik var");
        softAssert.assertAll();

    }


}
