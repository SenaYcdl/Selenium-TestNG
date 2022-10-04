package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {


    /*
Testelirimizi calistirirken istedigimiz siraya gore calismasini istersek
@Test objesinin bulundugu yere prority() methodunu kullaniriz
priority kullanmaz isek default olarak 0 dir.(priority atanmayan @Test ilk olarak calisir)
 */


    @Test (priority = 1)
    public void testYoutube() {
        driver.get("https://www.youtube.com");
    }

    @Test // priority 0 kabul eder
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test (priority =-1, groups = "gp1")
    public void testHepsiburada(){
        driver.get("https://www.hepsiburada.com");
    }

    /*
- @Test notasyonunun yanına (priority = sayı) yazarsak testlerin çalışma sırasını belirlemiş oluruz.
- Önce en küçük olan çalışır
- priority olarak herhangi bir sayı yazılmamışsa 0 olarak kabul edilir.



 TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder. (Yukardan asagi degil!)
 priority annotation Testlere öncelik vermek için kullanılır.
Kucuk olan Numara daha once calisir priority yazmayan Test method'u varsa oncelikle o calisir,
sonra priority yazan testler siralanir

 */



}
