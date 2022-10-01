package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath="//*[@id='pass']")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement login;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYaziElementi;
}
