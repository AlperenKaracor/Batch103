package day04IfStatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1:Kullanıcıdan ilk ve soy ismini alınız,ilk ve soy isminin ilk harflerini ekrana yazdırınız
        // Ali Can ==> AC

        Scanner input = new Scanner(System.in);

       /* System.out.println("ilk ismini gir ");

        char ilk = input.next().charAt(0);
        //java stringlerde her karaktere index veriri 0 dan baslayarak
        //charAt:stringdekı karakterlerden ındex ı () olanı ver   "At" = "da"
        System.out.println("soy ısmını gır ");
        char son = input.next().charAt(0);

        System.out.println("" + ilk + son);
        //+ işaretinin 2 anlamı vardır bırısı matematıksel toplama dıgerı bırlestırme anlamına gelır bırlestırmede sonuc
        //her zaman Strıng cıkar!!!!
       /* Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
        Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
        Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.*/

        System.out.println("tam ismini girrrrr");

        String tamIsım = input.nextLine();

        char ilkHarf = tamIsım.charAt(0);

        System.out.println(ilkHarf);

        char soyIsminIlkHarfi = tamIsım.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
}
