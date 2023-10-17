package day22inheritancepolymorphism;

public class HondaAccord extends Honda{
    /*
    1)Siz class olusturdugunuzda Java otomatik olarak gorunmez bir constructor verir
    cunku Java class in bir template(kalip) oldugunu ve object olusturulmak icin yaratildigini ve
    object olusturmak icin constructor in sart oldugunu bilir
    2)Java nin otomatik olarak olusturdugu bu gorunmez constructor a default constructor denir
    3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java default constructor i siler
    4)Bir class da birden fazla cons olabilir Fakat bu constructorlarin parametreleri farkli olmalidir
    5)this keyword "bu class" anlamindadir  "this.price" demek bu Class daki price isimli variable demektir
    this.price gibi syntax'i cons larin icinde kullanilir
    class daki hersey objeye gider objedeki hersey classda vardir
    kalip degistirilmez cons kullanildigimizda butun degisimler objede olur conslar sadece objeyi degistirmesi musaade edileblir
    cons kullanarak variable lar uzerinde yaptiginiz degisimler sadece object uzerindeki variablelarin degerlerini degistirir
    Class daki variable degerlerini degistiremez
    

     */


    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccord(){
    }
    public HondaAccord(int price){
        this.price = price;
    }
    public HondaAccord(int price , int year){
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord(int price , int year , String make , String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;

    }



}
