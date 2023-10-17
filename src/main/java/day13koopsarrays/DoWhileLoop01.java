package day13koopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {
        //Example 1 Kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana Kazandin yazdiriniz
        //      Aksi halde ekrana Kaybettin yazdiriniz
        //      Kullanici kazandikca oyun devam etmeli

        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//
//        do{
//            System.out.println("Bir sayi giriniz");
//             sayi = input.nextInt();
//
//            if(sayi<100){
//                System.out.println("Kazandin ");
//            }
//
//
//        }while(sayi<100);
//        System.out.println("kaybettin ");

//scope = etki alani suslu parantezlerin etki alanina denir looplarda dikkat et
//dowhile loop oyun olusturmada cok ise yarar

        //Example 2 kullanicidan isim aliniz ilk harfinin buyuk olup olmadiginzi kontrol ediniz


//        System.out.println("adinizi giriniz");
//        String isim = input.nextLine();
//        char ilkisim = isim.charAt(0);


        do {
            System.out.println("isim gir");
            char ilkharf = input.next().charAt(0);

            if (ilkharf >= 'A' && ilkharf <= 'Z') {
                System.out.println("basarili");
            } else {
                System.out.println("Yanlis girdin ");
                break;
            }
        } while (true);

//Infinite loop : sonsuz loop
        //loop olustururken sonsuz olmamasina dikkat etmen gerek app donar
        //sonsuz loopda memory dolana kadar app devam eder ve out of memory uyarisi verdigi zaman pc donar
        //UYARI BU EXTREME DANGER BIR DURUMDUR PC NIN COKMESINE SEBEP OLABILIR!!!(vay amk)
//Arttirma azaltma kisminda hata yaparsaniz infinite loop sorunsa olusur kisaca yarra yersin
        //for(int i=1;i<4;i--){
        //  System.out.println("Hi!");
        //}
        //bir baska cesidi for(int i=1;i=4;){
        //  System.out.println("hi");
        //}
//arttirma azaltma kismini yazmazsaniz infinite loop sorunsali i olusur
//        int i = 12;
//        while(i<15){
//            System.out.println("hi");
//        }
        //azaltma kismini yazmadigimiz icin sonsuz loop olusur

    }
}
