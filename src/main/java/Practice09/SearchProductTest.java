package Practice09;

import Pages.SearchProductPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class SearchProductTest extends TestBaseRapor {


    SearchProductPage searchProductPage;
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void searchProductPage() throws InterruptedException {

        extentTest=extentReports.createTest("AutomationExcercises","Web automationexercise sayfasina gidilmeli");

        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        extentTest.info(" 1. Tarayıcıyı başlat\n" +
                "         2. 'http://automationexercise.com' url'sine gidin");
        Driver.getDriver().get("http://automationexercise.com");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        extentTest.info("3. Ana sayfanın başarıyla görünür olduğunu doğrulayın");
        String homeUrl = "https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), homeUrl);

        searchProductPage = new SearchProductPage();

        // 4. 'Ürünler' butonuna tıklayın
        extentTest.info("4. 'Ürünler' butonuna tıklayın");
        searchProductPage.prouducts.click();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        extentTest.info("5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın");
        Assert.assertTrue(searchProductPage.allProductTitle.isDisplayed());

        //String productPageUrl = "https://automationexercise.com/products";
        //Assert.assertEquals(Driver.getDriver().getCurrentUrl(), productPageUrl);

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        extentTest.info("6. Arama girişine ürün adını girin ve ara düğmesine tıklayın");
        searchProductPage.searchbox.sendKeys("blue top", Keys.TAB,Keys.ENTER);
       // actions.click(searchProductPage.searchbox).click().perform();

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        extentTest.info("7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın");
        Assert.assertTrue(searchProductPage.searchedProducts.isDisplayed());

       // List<WebElement> urunlistesi= searchProductPage.searchedProductsList;

//        for (WebElement w: urunlistesi) {
//            Assert.assertTrue(w.isDisplayed());
//            Thread.sleep(2000);
//        }

        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğu doğrulandı");
        actions.click(searchProductPage.viewProducts).perform();
        Assert.assertTrue(searchProductPage.bluetop.isDisplayed());


        //Sayfayi kapatin
        Driver.closeDriver();
    }
}
