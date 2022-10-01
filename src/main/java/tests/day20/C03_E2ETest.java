package tests.day20;

import Pages.HotelMyCampPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class C03_E2ETest {

    @Test
    public void E2ETest() throws InterruptedException {


        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HotelMyCampPage hmcPage = new HotelMyCampPage();
        hmcPage.login.click();

        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.
        hmcPage.userName.sendKeys(ConfigReader.getProperty("username"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();

        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hmcPage.hotelManagementButton.click();
        Thread.sleep(3000);
        hmcPage.roomReservation.click();
        hmcPage.addRoomReservationButton.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker=new Faker();
        Select select=new Select(hmcPage.idUserDrop);
        select.selectByVisibleText("manager");
        Select select2=new Select(hmcPage.idHotelRoom);
        select2.selectByVisibleText("Gudrun DuBuque");
        hmcPage.price.sendKeys("500");
        hmcPage.dateStart.sendKeys("10/10/2022");
        hmcPage.dateEnd.sendKeys("10/15/2022");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys("3").
                sendKeys(Keys.TAB).sendKeys("Sena Yucedal").
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).sendKeys("sena@gmail.com").
                sendKeys(Keys.TAB).sendKeys("Please save it").perform();


        Thread.sleep(3000);
        //Save butonuna tıklayın.
        hmcPage.save.click();

        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(3000);
        Assert.assertTrue(hmcPage.roomReservationMessage.isDisplayed());

        //OK butonuna tıklayın.
        hmcPage.ok.click();

        Driver.closeDriver();

    }
}
