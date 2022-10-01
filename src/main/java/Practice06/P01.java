package Practice06;

import Pages.DhtmlgoodiesPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class P01 {

    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.


    @Test
    public void test01(){

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();
        Actions actions=new Actions(Driver.getDriver());
//        actions.dragAndDrop(dhtmlgoodiesPage.oslo,dhtmlgoodiesPage.norway).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.stockholm,dhtmlgoodiesPage.sweden).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.copenhagen,dhtmlgoodiesPage.denmark).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.seoul,dhtmlgoodiesPage.southkorea).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.italy).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.washington,dhtmlgoodiesPage.unitedStates).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.madrid,dhtmlgoodiesPage.spain).perform();



        actions.dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark)
                .dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain)
                .dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy)
                .dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southkorea)
                .dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden)
                .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates)
                .perform();

        Driver.closeDriver();


        /*
        Framework ler buyudukce yeni classlar yeni test methodlari yeni webelementler olusturdukca
        icinden cikilmaz, anlasilmaz, tekrar bakimi yapilamaz, guncellemesi cok zor hatta imkansiz bir hal alir

        uzmanlar reusable maintainable,rahat manipule eddilebilir bir framework icin
        bir design pattern olarak Page Object Model de karar vermisler

        olmazsa olmzlar
        1)driver class
        2)Page class
        3)test class

        aradigimiz  bir webelementi ya da bir methodu kolaylikla bulabilmek ve guncellemek icin java da
        ogrendigimiz oop concept selenium page object model ile birlestirilmis oluyor


PAGE FACTORY
PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.

Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini
@FindBy annotionu ile algılar. How kalıbı ile birlikte elementlerin ayırt edici
locator’ından hangisini kullanacaksak belirtilir. Sonrasında ise o ayırt edici
locator’ın adı tanımlanır. Public WebElement ile birlikte test senaryolarında
kullanmak üzere isimlendirmesi yaparız. Burada isimlendirme daha sonra baktığında
anlayabilmek için önemlidir, okunaklı olmalıdır.

         // pagefactory'nin mantığı: pages sayfasında yer alan pagefactory ile
        // buradaki webelementleri driver ile ilişkilendirmiş oluyoruz.


       Neden Pom
        Özetle;
1- Tekrarlardan kurtuluruz
2- Daha az kod daha çok iş
3- Kolayca update yapabilme

         */
    }
}
