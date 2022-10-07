package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchProductPage {

    public SearchProductPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement prouducts;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductTitle;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchbox;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchedProducts;

    @FindBy(linkText = "View Product")
    public WebElement viewProducts;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement bluetop;

    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> searchedProductList;


}
