package day28abstraction;

public abstract class Animal {

    //body si olmayan methodlar abstract method olarak adlandirilir
    //Bir methodu abstract yapmak icin; i)method body yi sil ii)"abstract" keyword kullan
    //"abstract" methodlar "abstract class" icinde olmalidir
    public abstract void eat();
//abstract class larda hem abstract hem de concrete method(non abstract) kullanilablir
    public void drink(){
        System.out.println("Animals drink...");

    }

//abstract "move" method olusturun

    public abstract void move();













}
