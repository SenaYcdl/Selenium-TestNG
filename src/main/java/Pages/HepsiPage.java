package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiPage {

    public HepsiPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Elektronik')]")
    public WebElement electronics;

    @FindBy(xpath = "//a[normalize-space()='Bilgisayar/Tablet']")
    public WebElement BilgiTab;

    @FindBy(xpath = "(//div[@class='sf-ChildMenuItems-OMxRJDk0466HYQpTli0P'])[1]//ul//li//ul//li//a//span")
    public List<WebElement> titles;



}