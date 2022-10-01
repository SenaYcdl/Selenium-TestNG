package Notlar;

public class SingletonPatternNot {

    // POM'de Driver icin TestBase class'ina extends etmek yerine
//Driver class'indan static method'lar kullanarak driver olusturup,
//ilgili ayarlarin yapilmasi ve en sonda driver'in kapatilmasi tercih edilmistir.
//POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini engellemek icin
//Singleton pattern kullanimi benimsenmistir.

//Singleton Pattern -> tekli kullanim, bir class'in farkli class'lardan
// obje olusturularak kullanimini engellemek icin kullanilir.
// Bunu saglamak icin yapmamiz gereken sey oldukca basit
// obje olusturmak icin kullanilan constructor'i private yaptiginizda
// baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ

// POM'da artik inheritance yerine object ve static kullanarak methodlara ulasiyoruz
// page classina objeyle driver classina static ile ulasiriz
}
