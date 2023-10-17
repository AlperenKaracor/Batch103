package day12loops;


import java.util.Scanner;

public class whileloops01 {
    public static void main(String[] args) {

        //example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
//1.yol
        //Butun loop larda baslangic degeri hangi sartlarda calisacagi arttirma azaltma degeri vardir
        //for ile shile arasindaki tek fark shile daha okunaklidir for daha tekniktir 2 side ayni isi yapar
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//2.yol
        int i = 3;

        while (i < 11) {


            System.out.println(i + " ");

            i++;
        }
        //Examle 2= 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yazdir

        int a = 17;

        while (a > 3) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }


            a--;

        }

        //Example 3: 12 den 67 ye kadar sayilarin toplamini veren kodu yaziniz

        int sum = 0;
        int m = 12;

        while (m < 15) {

            sum = sum + m;

            m++;
        }
        System.out.println(sum);


//Example 4: size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

        Scanner scan = new Scanner(System.in);

        int sonuc = 0;

        int sayi = 385;

        while (sayi > 0) {

            sonuc = sonuc + sayi % 10;


            sayi = sayi / 10;

//syntax

        }
        System.out.println();
        System.out.println(sonuc);

        //example 5:Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //    3 ==> 3x1 =3  3x2 = 6 3x3=9

        System.out.println("Carpim tablosunu giormek icin sayi giriniz");
        int s = scan.nextInt();

        int n = 1;

        while (n < 11) {

            System.out.println(s + "x" + n + " = " + s * n);

            n++;

        }

//senden ne istendigini iyi anla ona gore davran dumduz KAFA ATMA AMK YERINDE


    }
}
