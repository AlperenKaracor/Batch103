package day04IfStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1.Yol

        Scanner input = new Scanner(System.in);
        /*
        System.out.print("İlk adınızı giriniz: ");
        String ilkad = input.next();
        System.out.print("Orta adınızı gırınız: ");
        String ortaad = input.next();
        System.out.print("Soy adınızı gırın: ");
        String soyad = input.next();
        System.out.print("Kimlik numaranızı gırınız: ");
        String ssn = input.next();
        System.out.println(ilkad + " " + ortaad + " " + soyad);
        System.out.println(ssn);
        */
        //2.yol
        /*
        System.out.println("ılk orta ve soy adınız yaz");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " +  orta + " " + soy);
        System.out.println(kimlik);*/
        System.out.println("tam adını gır");
        String tamisim = input.nextLine();

        System.out.println(tamisim);
        /*
        next() ile nextLine() farkı nedir?
        next() methodu kullanıcıdan gelen Stringin sadece ilk kelimesini alır
        nextLine() methodu kullanıcıdan gelen Stringın tamamını alır.
         */


    }
}
