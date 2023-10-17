package day09stringmanupulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

//        String str = "Java is easy";
//        //indexOf() method'u verilern character ve character'lerin ilk gorunumunum index'ini verir.
//        int idxA = str.indexOf("a");
//        System.out.println("Ilk index = " + idxA);
//
//        //lastIndexOf() method'u verilen character veya character'lerin "son gorunumunun" index'imi verir.
//        int IdxA2 = str.lastIndexOf("a");
//        System.out.println("Son index = " + IdxA2);
//
//        //Soru 2
//        String akr = "Kara kara dusunme Ankara";
//
//        int a = akr.indexOf("kara");
//        System.out.println(a);
//
//        int b = akr.lastIndexOf("kara");
//        System.out.println(b);
//
//        String s = "Mississippi";
//
//        int idxI = s.indexOf('i');//indexOf() hem String hem de Char ile kullanilabilir
//
//        System.out.println(idxI);
//
//       int v = s.indexOf("iss");//ilk gorunumun "ilk" karakterinin indexini verir
//
//        int c = s.lastIndexOf("iss");//son gorunumun "ilk" karakterini verir
//
//        System.out.println(v);
//        System.out.println(c);

        //Example 1: Bir String'deki bir karakterin tekrarsiz veya tekrarsiz olup olmadiginiz gosteren kodu yaziniz
        //  "Helloooo" ==> H - Tkrarsiz  e - Tekrarsiz  l - Tekrarli  o - Tekrarli

        String t = "Helloooo";

        char c = 'l';

        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";
        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar characteri gectikten sonra istenen characterin
        //ilk gorunumunun indexini return eder
        int sonuc = u.indexOf("e", 0);

        System.out.println(sonuc);//7

        int son = u.lastIndexOf("a", 5);

        String v = " ";

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);
        //isEmpty() methodu bir stringin bos olup olmadigini kontrol eder
        //eger stringde hic karakter yoksa isEmpty() methodu true return eder herhangi bir karakter varsa false return eder
        //length() == 0 demek isEmpty() true verir demektir
        //Bir stringin bos olup olmadigini anlamak icn length()==0 kullanmayin isEmpty() kullanin
        char h = ' ';
        int j = 0;
        System.out.println(h + j);

        String x = " ";
        boolean blankMI = x.isBlank();
        System.out.println(blankMI);
        //isblank() hem bos string icin hem de sadece space iceren stringler icin true return eder

        //Example 2 : Kullanicidan alinan isim mutlaka spacedenfarkli en az bir karakter icermelidir

        Scanner input = new Scanner(System.in);
        System.out.println("ilk ismini gir");
        String ilk = input.nextLine();

        if (ilk.isBlank()) {
            System.out.println("Sana ismini gir dedim");
        } else {
            System.out.println(ilk);
        }

        String m = "Hello everyone!: ";



    }
}
