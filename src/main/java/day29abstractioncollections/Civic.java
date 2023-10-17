package day29abstractioncollections;


/*
   "absrtact" methodlar sadece ne yapilacagini soyler(what to do)
   "concrete method lar ne yapalicagi ile birlikte nasil yapilacagini da soyler

   "interface" ler bir yapilacak isler listesidir.(To do list)
   "child class a neler yapilacagini soylemek icin interface olustururuz"
   return typelar farkli olacaksa method isimleri ayni olamaz
   "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method ismi olustursaniz bu
   methodlarin return typelari ayni olmalidir Aksi taktirde hata verir
   interfacelerde constructor olmadigi icin obje olusturamazsin
   interfacelerde constructor olmadigi icin interfacelerden obje olusturulamaz
   abstract class larda class olduklari icin constructor vardir Ama constructorlar classlarda object olusturamazlar
   interface bir class degildir

   ONEMLI INTERVIEW SORUSU: Abstract Class ile Interface in farklari nerlerdir
   once method sonra variable sonra parent child iliskisi hakkinda konus
   1)Method
           "abstract Class" hem abstract hem de concrete method lar icerebilir
           "Interface ler ise sadece abstract methodlar icerir
           Ama istersek icindede defualt ve static keyworler kullanarak concrete method lar olusturabiliriz

           2)Variable
           Abstract classlarda normal classlardaki gibi her turlu variable olusturulabilir
           Interfacelerde ise variable lar public static ve final olmak zorundadir

           3)Inheritance
           Abstract Class lar class olduklari icin multiple inheritace a musaade etmezler
           Interface ler ise multiple inheritance i desteklerler.

           4)Object Creation
           Abstract Class larda constructor vardir ama object olusturmada kullanilmazlar
           Interface lerde ise constructor olmadigindan object olusturulamaz

           Soru:Object Oriented Programming Language prensipleri nelerdir
           1)Inheritance 2)Polymorhism 3)Encapsulation 4)Abstraction
           bunlarin hepsini tek tek aciklayacak hale gel amk





 */
public class Civic implements Engine,Ac {


    @Override
    public void run() {
        System.out.println("Civic iyi calisir");
    }
}


