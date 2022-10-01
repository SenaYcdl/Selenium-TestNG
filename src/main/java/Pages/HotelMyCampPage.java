package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HotelMyCampPage {

    public HotelMyCampPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;
    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;
    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[@id='divMessageResult']")
    public WebElement hataliGiris;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(xpath = "//*[text()='Add Room Reservation '] ")
    public WebElement addRoomReservationButton;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUserDrop;

    @FindBy(xpath = "//*[@id='IDHotelRoom']")
    public WebElement idHotelRoom;

    @FindBy(xpath = "//*[@id='Price']")
    public WebElement price;

    @FindBy(xpath = "//*[@name='DateStart']")
    public WebElement dateStart;

    @FindBy(xpath = "//*[@id='DateEnd']")
    public WebElement dateEnd;



    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement save;

    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationMessage;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement ok;

}

