package day08stringmanipulations;

import java.util.Scanner;

public class StringManupulations01 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz: ");
//        String isim = input.next();
//        char ilkHarf = isim.charAt(0);
//
//        char sonHarf = isim.charAt(isim.length() - 1);//Yazdiginiz code sadece bazi durumlar icin calisirsa o code hard code denir
//                                                      //Yazdigimiz code her durum icin calisirsa o code a Dynamic Coding denir
//
//        System.out.println("" + ilkHarf + sonHarf);
////2 yol
//
//        String ilk = isim.substring(0, 1);
//
//        String son = isim.substring(isim.length() - 1);
//
//        System.out.println(ilk + son);

        //Example 2 : Verilen String deki sadece hayvan isimlerini ekrana yazdiriniz
        //  "Ben kedi esim tavuk oglum inek sever"
        String str = "Ben kedi, esim tavuk, oglum sever inek";

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34,38);
        System.out.println(kedi + tavuk + inek);
        //Note:SubStringin 2 kullanimi vardir:
        //1)substring(baslangic indexi, bitis indexi) Stringin ortasindan bir parca almaya yarar.
        //2)substringin(baslangic indexi) String in verilen index ten snuna kadar almaya yarar.

        //Example 3 : ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
        //       ali Can ==> AC              Thansin Yurdakul ==>

        System.out.println("Ilk ve soy isini gir");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a + b);






    }
}
