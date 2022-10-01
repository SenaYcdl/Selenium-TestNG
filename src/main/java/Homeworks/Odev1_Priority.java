package Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;


public class Odev1_Priority {

    //1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
    //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    }


    @AfterMethod
    public void tearDown(){

        driver.quit();
    }


    @Test (priority = 1)
    public void titleTest() {

        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        Assert.assertTrue(driver.getTitle().contains("YouTube"));
    }


    @Test (priority = 2)
    public void imageTest() throws Exception {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement logo=driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
    }


    @Test (priority=3)
    public void searchboxTest() throws Exception {

        WebElement searchbox=driver.findElement(By.xpath("(//*[@id='search'])[2]"));
        Assert.assertTrue(searchbox.isEnabled());
    }


    @Test (priority = 4)
    public void wrongTitleTest() {

        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertFalse(driver.getTitle().contains("youtube"));
    }
}