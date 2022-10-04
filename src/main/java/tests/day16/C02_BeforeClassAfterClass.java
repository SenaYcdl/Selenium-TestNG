package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {



    // @BeforeClass ve @AfterClass notasyonlarını TestNG de kullanırken JUnit'teki gibi static yapmaya gerek yoktur



    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }
    @Test (groups = "gp1")
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void testTechproed() {
        driver.get("https://www.techproeducation.com");
    }
}