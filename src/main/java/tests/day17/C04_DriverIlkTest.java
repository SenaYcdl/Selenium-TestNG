package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {

    @Test
    public void test1() {

        // testbase class'ina extend ederek kullandigimiz driver yerine artik
        // Driver class'indan kullanacagimiz getDriver() static methodunu kullaniriz
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.hepsiburada.com");
        Driver.closeDriver();
    }
}
