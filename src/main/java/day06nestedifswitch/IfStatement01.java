package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız : ");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("Gecerli yaş giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if(yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetıskın");
        }else{
            System.out.println("Tanımlanmamıs evre");
        }





    }
}
