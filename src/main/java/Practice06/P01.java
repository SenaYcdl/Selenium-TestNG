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
PageFactory bizlere nesne deposu olu??turmaya imkan veren, s??rd??r??lebilir,
yeniden kullan??labilir ve elementleri tek bir yerden y??netmeyi sa??layan bir Page object model konseptidir.

Page Factory???i kullan??m??na bakacak olursak PageFactory model, Web elementlerini
@FindBy annotionu ile alg??lar. How kal??b?? ile birlikte elementlerin ay??rt edici
locator?????ndan hangisini kullanacaksak belirtilir. Sonras??nda ise o ay??rt edici
locator?????n ad?? tan??mlan??r. Public WebElement ile birlikte test senaryolar??nda
kullanmak ??zere isimlendirmesi yapar??z. Burada isimlendirme daha sonra bakt??????nda
anlayabilmek i??in ??nemlidir, okunakl?? olmal??d??r.

         // pagefactory'nin mant??????: pages sayfas??nda yer alan pagefactory ile
        // buradaki webelementleri driver ile ili??kilendirmi?? oluyoruz.


       Neden Pom
        ??zetle;
1- Tekrarlardan kurtuluruz
2- Daha az kod daha ??ok i??
3- Kolayca update yapabilme

         */
    }
}
