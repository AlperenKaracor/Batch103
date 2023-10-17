package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {


        /*
        kullanıcıdan gun sayısını alın ve gun ismini ekrana yazdırınız.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Gün numarasını gırınız...");
        byte gunNo = input.nextByte();

        switch(gunNo) {

            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Salı");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gün sayısı giriniz");



        }






























    }
}
