package day21accesmodifiersinheritance;

public class Student {

    /*
    Access Modifier
    1)public(halkKutuphanesi)  2)protected(orduevi)  3)default(ofis)(Access Modifieri default yapmak icin access modifier yazmayiz hicbirsey yazmayiz
      4)private(ehliyet)
      note:Acces modifier genisten dara dogru sayiniz
      public > protected > default > private
      Note:Access Modifier lari birer birer aciklayiniz
      public olanlar her class dan kullanilabilir
      protected olanlar baska package lerden kullanilamaz ancak baska package de child class icinden kullanilabillir
      default olanlar baska package den kullanilamaz
      private olanlar sadece olusturulduklari class icinde kullanilabilirler
      Note protected ile default un fakini soyleyiniz
      protected olanlar

     */
    /*

 /*
        Access Modifier
        1)public     2)protected     3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)     4)private

        Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private
        Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler
        Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar
        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz
     */





     //public her class dan kullanilabilir
     public String stdName = "TomHanks";
    //protected olanlar baska package lerden kullanilamaz ancak baska package de "child class" icinden kullanilabilir
    protected String address = "Miami";
    //defualt olanlar baska package den kullanilamazlar
     String email = "th@gmail.com";
     //private olanlar sadece olusturulduklari class icinde kullanilabilirler
     private String stdId = "20206517004";



}
