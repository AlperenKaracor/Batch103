package day06nestedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
        Kullanıcıya ya ısmı sorunuz ve kullanıcının verdıgı ay ısmınden son aya kadar ekrana yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini gir...");
        String ayIsmi = input.next().toLowerCase();

        switch(ayIsmi){

            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz");

        }
    }
}
