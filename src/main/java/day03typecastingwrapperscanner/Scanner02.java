package day03typecastingwrapperscanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1: Sayıları kullanıcıdan alan ve toplama ıslemı yapan kodu yazınız.

        //1.Adım:Scanner Class'indan object olusturun

        Scanner input = new Scanner(System.in);

        //2.Adaım:Kullanıcıya ne yapacagını soyle.
        System.out.println("İlk sayıyı gırınız");
        double sayı1 = input.nextDouble();

        System.out.println("ıkıncı sayıyı gır ");
        double sayı2 = input.nextDouble();

        System.out.println(sayı1 + sayı2);






    }

}
