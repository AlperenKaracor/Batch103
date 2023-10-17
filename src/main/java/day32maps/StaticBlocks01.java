package day32maps;

public class StaticBlocks01 {
    //static degerin icinde atama yparsan java class i olustururken variable i main methoddan once olusturur
    //Static block lar ihtiyacimiz olan variablerin class olusturma safhasinda elimizde saglar
    //static block lar class icindeki herseyden once calistirilir
    //main method dan ve diger tum methodlardan once celistirilir
    //Static blocklar icinde sadece static variable lara deger atanabilir
    // main method static ya bunun icinde kullandiginiz hersey static olmali
    //static vlock un icinde kullanacagin hersey static olmalidir
    //Java static block u her zaman class i olustururken calistirir yani main method dan sonra
    //1 den fazla static block koyabiliriz
    //1 den fazla static block varsa ustteki once calistirilir
    //Static block ne ise yarar :
    //static olanlar class a yapistirilir
    //class i butun ozellikleriyle beraber var ediyoruz sonra main method butun ozellikleriyle tamamlanmis bir class bulur
    public static double pi;
    static{
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

    }

    static{
        pi=3.14;
        System.out.println("Static block1");

    }

}
