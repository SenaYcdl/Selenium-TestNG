package Notlar;

public class TemelClasslar {

    /*
    POM : Page Object Model : Kabul gormus bir framework dizayn pattern’dir.
Temel Class’lar :
1- pages : locate’ler ve faydali reusable method’lar
2- Driver : static method’larla ulasilacak sekilde organize ettik, tek bir browser’a bagimli
olmaktan kurtulduk, getDriver( ) ve closeDriver( ) method’lari sayesinde istedigimizde
yerde driver acmak veya kapatmak elimizde
Driver class’ini farkli objeler olusturulmamasi icin Singleton pattern’e uygun olarak
duzenledik.
3- configuration.properties : test datalarimizi tutmak icin kullandigimiz dosyadir.
key=value seklinde ikililerden olusur. Key’ler uniue olmak zorundadir.
ConfigReader : Configuration.properties dosyasindaki test datalarini alabilmek icin
olusturdugumuz class’dir. Java’daki Properties class’i sayesinde bizim gonderdigimiz
key’e ait value’yu configuration.properties dosyasindan bize getirir.



1- Page Object Model : Testlerimizi daha kolay ve duzenli olarak hazirlamamiz ve calistirmamiz icin
olusturulmus bir modeldir.
Framework icin uretilmis benzer modeler olmakla birlikte en guncel olan ve cok kullanilan model
oldugu icin POM’i ogrendik

2- POM dosya yapisi :
-Pages : Test yapacagimiz web page’ler icin Pages package’in altinda bir class olusturuyoruz.
Bu class’larda mutlaka yapmamiz gereken sey driver’i olusturdugumuz Driver clasindan alip
PageFactory.initElements ile ilk deger atamasi yapmaktir. Sonrasinda web sayfamizda
kullanacagimiz WebElementlerin tamamini public olarak olusturmak ve @FindBy notasyonu ile
locate etmektir. Eger istersek login gibi bazi adimlari yapacak methodlari da bu class’da
olusturabiliriz.
Test clasimizdan Page sayfasindaki variable ve method’lara obje olusturup erisim saglariz.


- configuration.properties : Bu dosyayi testlerimizde kullanacagimiz url,test datalari gibi kullanicidan
aldigimiz datalari dinamik yapmak icin kullaniriz.
Tum testlerimizi bu sayfadan alacagimiz datalara gore dizayn ederiz. Boylece bu dosyada
yapacagimiz bir deger degisikligi ile tum testCase’lerindeki test datalarini guncelleyebiliriz.
Bu sayfayi basit bir text dosyasi gibi dizayn ederiz her test datasini key=value seklinde key,value ile
olustururuz.


- ConfigReader : Bu class test clasimiz ile configuration.properties dosyasi arasinda tercumanlik yapar.
Icinde .properties uzantili dosyalari okumak icin gerekli bir static blok olustururuz. Ayrica Test
classlarimizdan cagirmak icin getPropert() methodunu olustururuz. Bu method test class’indan
gonderdigimiz key degerini static blok yardimi ile configuration.properties’de bulup karsisindaki
value’yu bize dondurur.


-Driver : Test clasimizda ve page clasinda kullanacagimiz driver’i olusturdugumuz class’tir. Utilities
Package’i altinda olustururuz. Driver class’ini Singleton yapabiliriz.
Driver’i static olarak olusturur ve olusturdugumuz getDriver() method icinde driver’imiza deger
atamasi yapariz.
Is hayatinda karsilasacagimiz farkli browser’lar (chrome,firefox,safari vb..) deger atama islemi
yapmadan once kullanicinin tercihini aliriz.
Kullanici tercihini almak icin configuration.properties dosyasinda browser=chrome gibi bir key,value
ikilisi olusturur buradaki tercihe gore driver’a deger atamak icin de switch case kullaniriz.
Ayrica her driver cagirdigimizda yeni driver olusturmamasi icin once if ile driver’in atamasi yapilmis
mi control ederiz, atama yapilmissa ayni driver ile devam eder, atama yapilmamissa yeni bir driver
olusturur ve deger atayip test sayfasina doneriz.
Bu Class’ta ayrica window.manage ayarlarini da yapar, en sonda da closeDriver method ile driver’i
kapatma islemine de yardimci oluruz

     */
}









