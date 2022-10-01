package Practice05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {

    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
// 3. Açılır metni alın
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
// 5. Açılır pencereyi kabul edin


    @Test
    public void test(){

        //1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        //2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//*[@id='button1']")).click();

        //3. Açılır metni alın
        String message=driver.switchTo().alert().getText();

        //4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        Assert.assertTrue(message.contains("I am an alert box!"));

       // String expectedText = "I am an alert box!";
       // Assert.assertEquals(actualText,expectedText);

        //5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();


    }

}
