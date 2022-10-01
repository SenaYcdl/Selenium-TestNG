package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;


public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {


    // TestNG framework'unde @Before ve @After notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    //Çalışma prensibi JUnit deki Before,After ile aynıdır


    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
    @Test
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}