package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

    public SaucedemoPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath="//*[@id='user-name']")
    public WebElement username;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath="//*[@class='product_sort_container']")
    public WebElement productSortContainer;







}
