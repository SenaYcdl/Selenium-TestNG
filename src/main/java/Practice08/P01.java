package Practice08;

import Pages.HerokuTestPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.security.Key;
import java.util.List;

public class P01 {

    HerokuTestPage herokuTestPage;
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {


        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        herokuTestPage=new HerokuTestPage();
        //kodlarimizi yazarken clean code kapsaminda daha sade kod yazabilmek amaci ile her
        //test methodu icerisinde ayri bir object create etmektense bu object i class seviyesinde
        //instance olarak create edip test methodlarinda buna deger atamak ve kullanmak daha uygun bir yontemdir

        herokuTestPage.onblur.click();
        herokuTestPage.onclick.click();
        herokuTestPage.onclick.click();
        actions.contextClick(herokuTestPage.contextmenu).
                doubleClick(herokuTestPage.doubleclick).
                click(herokuTestPage.onfocus).
                click(herokuTestPage.onkeydown).sendKeys(Keys.ENTER).
                click(herokuTestPage.onkeyup).sendKeys(Keys.ENTER).
                click(herokuTestPage.onkeypress).sendKeys(Keys.ENTER).
                moveToElement(herokuTestPage.onmouseover).
                click(herokuTestPage.onmouseleave).moveToElement(herokuTestPage.onmousedown).
                click(herokuTestPage.onmousedown).perform();


        Thread.sleep(2000);
    }


    @Test (dependsOnMethods = "test01")
    public void test02() {

        //dogrulayiniz
        List<WebElement> clicked = herokuTestPage.eventTriggered;
        Assert.assertEquals(clicked.size(), 11);

        Driver.closeDriver();
    }
}
