package day28abstraction;

public interface Engine {
    /*
   Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
   bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

*/
    //interfacelerdeki tum methodlar abstract olmak zorundadir
    //interfacelerde method abstract method olustururken abstract keyword kullanmaya gerek yoktur
    //cunku java o methodun abstract oldugunu bilir
    //interfacelerdeki methodlar otomatik olarak public kabul edilir bu yuzden o methodlar icin-
    //-public yazmaya gerek yoktur
    //public abstract void eco(); ile void eco(); ayni anlama gelir

    /*
    interfacelerdeki tum methodlar abstract oldugu icin interface lere fully abstraction denir
    Abstract classlarda abstract method ve concrete method bir arada kullanildigi icin Abstract Class lara
    fully abstraction denmez.
     */
    void eco();

    void gas();

    void tsi();
//Asagidaki non-static methoddur
    public default int add(int a,int b){
        return a+b;
    }
    //defualt keyword koydugumuz icin hata vermedi buraki defualt access modifier degil
    //buradaki defualt bir keyword
    //defualt keyword kullanrak interface lerin icinde body si olan methodlar uretebilirsiniz
    //Asagidaki method static methoddur
    public static String update(String str){
        return str + "!";
    }
    //static keyword kullanrak interface lerin icinde bodysi olan methodlar uretebilirsiniz




























}
