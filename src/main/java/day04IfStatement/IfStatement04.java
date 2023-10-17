package day04IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class IfStatement04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz");
//        int s = input.nextInt();
//
//        if(s%2==0){
//            System.out.println("Cift sayi");
//        }
//        //"!=" esit degil demektir
//        if(s%2!=0){
//            System.out.println("Tek sayi...");
//        }
//
////2. yol
//        if(s%2==0){
//            System.out.println("cift sayi...");
//        }else{
//            System.out.println("Tek sayi");
//        }
//bir sayinin negatif mi pozitif mi yoksa notr mu oldugunu soyleyen kodu yaziniz

//        System.out.println("Bir sayi giriniz");
//        double d = input.nextDouble();
//
//        if(d>0){
//            System.out.println("Pozitif");
//        }else if(d==0){
//            System.out.println("Notr");
//
//        }else{
//            System.out.println("Negatif");
//        }

//kullanici gun numarasini girsin kod gun ismini yazsin
        //2==> pazartes


//        System.out.println("Gun numarasi giriniz: ");
//        byte gunNO = input.nextByte();
//
//        if(gunNO==1){
//            System.out.println("Pazar");
//        }else if(gunNO==2){
//            System.out.println("Pazartesi");
//        }else if(gunNO==3) {
//            System.out.println("Sali");
//        }else if(gunNO==4) {
//            System.out.println("Carsamba");
//        }else if(gunNO==5) {
//            System.out.println("Persembe");
//        }else if(gunNO==6) {
//            System.out.println("Cuma");
//        }else if(gunNO==7) {
//            System.out.println("Cumartesi");
//        }else{
//            System.out.println("Gecersiz sayi");
//        }


//kullanicidan gun isimlerini aliniz o gunun hafta ici mi hafta sonu mu oldugunu kullaniciya soyleyin

        System.out.println("Gun giriniz : ");
        String gun = input.next();
        System.out.println(gun);


        String a = "Haftasonu";
        String b = "Haftaici";

       if(gun.equalsIgnoreCase("Pazar")){
           System.out.println(a);
       }else if(gun.equals("Cumartesi")) {
           System.out.println(a);
       }else if(gun.equals("Pazartesi")){
            System.out.println(b);
       }else if(gun.equals("sali")) {
           System.out.println(b);
       } else if (gun.equals("Carsamba")) {
           System.out.println(b);
       }else if(gun.equals("Persembe")){
           System.out.println(b);
       }else if(gun.equals("Cuma")){
           System.out.println(b);
       }else{
           System.out.println("Gecersiz gun");
       }

       if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
           System.out.println("Haftaici");
       }else if(gun.equalsIgnoreCase("Pazartesi") ||
               gun.equalsIgnoreCase("Sali") ||
               gun.equalsIgnoreCase("Carsamba") ||
               gun.equalsIgnoreCase("Persembe") ||
               gun.equalsIgnoreCase("Cuma")){
           System.out.println("Haftaici");
       }else{
           System.out.println("Hata");
       }




    }
}
