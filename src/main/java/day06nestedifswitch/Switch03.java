package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Kullanıcı dan işlem ve 2 tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinesi yapınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz +,-,*,/,%");
        char islem = input.next().charAt(0);

        System.out.println("1. sayıyı giriniz");
        double ilk = input.nextDouble();

        System.out.println("2. sayıyı gırınız");
        double ikinci = input.nextDouble();

        switch(islem){

            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println((ilk + ikinci)/100);
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıstır");
        }
    }
}
