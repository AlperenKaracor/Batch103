package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        //1.Way if - else

        int a = 0;
        if(a>0){
            System.out.println("P");
        }else{
            System.out.println("P degil");
        }
                       //Condition         ?         condition dogru ise uygulanacak kod     :          condition yanlis ise uygulanacak kod
        String sonuc = a>0                 ?              "pozitif"                          :                   "Pozitfi degil";
        System.out.println(sonuc);
   //2 sayidan kucuk olani secen kodu yaziniz
        int b = 120;
        int c = 23;

        int min = b<c ? b : c;
        System.out.println(min);
        //Example 3 verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //pozitif sayilarin ve 0 in mutlak degeri kendileridir
        //negatif sayilarin mutlak degeri -1 ile carpilmis halleridir/

        int d = -444232323;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4 : Iki tane sayi ayni isaretli ise bu sayilari carpiniz farkli isaretli ise "islem yapamam" mesaji veriniz
        //ternary farkli data tiplerinde sonuc return ederse sonucun data type ini object yapiniz
        int e = 12;
        int f = 10;

         Object baba = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";
        System.out.println(baba);













    }
}
