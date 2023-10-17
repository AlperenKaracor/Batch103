package day11loops;

public class Forloop01 {

    public static void main(String[] args) {

        //Example 1: 3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz.
        //sum= toplam demek
        //sout(sum) loop un disina yazilirsa sadece sum in sadece son degerini ekrana yazdirir
        // loop un icine yazilirsa her bir loop icin sum in hangi degerleri aldigini yazdirir

//        int sum = 0;
//
//        for (int i = 3; i < 7; i++) {
//            sum = sum + i;
//
//            System.out.println(sum);
//        }
//
//
//        //6 dan 3 e kadar olan sayilarin carpimini yaziniz
//
//        int multiply = 1;
//        for (int i = 6; i > 2; i--) {
//            multiply = multiply * i;
//
//        }
//        System.out.println(multiply);
//
////Example 3 :Size verilen bir tam sayinin rakamlari toplamini bulunuz
//        //bir sayinin son rakamini almak isterseniz %10 islemi yap
//        //javada tamsayiyi tamsayiya bolerseniz sonuc tamsayi olur.Eger sonuc virgullu sayi ise java ondalik kismi siler
//
//        int num = 1453;
//
//        num = Math.abs(num);//Mutlak deger methodu
//        int sonuc = 0;
//        for (int i = num; i > 0; i = i / 10) {
//
//            sonuc = sonuc + i % 10;
//        }
//        System.out.println(sonuc);
//
////Example 4: Size verilen bir String i ters ceviren kodu yaziniz
////  "Kaba"    ===> "abaK"
//
//        String str = "Kaba";
//        //concatination yapacaksaniz bos String koyun
//        String ters = "";
////bu bir interview sorusudur(esasinda aciklama isterler kod degil mantigi anlatmani istiyorlar)
//        for( int i=str.length()-1 ; i>=0 ; i--) {
//            ;
//
//            char c = str.charAt(i);
//
//            ters = ters + c;
//        }
//        System.out.println(ters);

//Example 3: 4 den 7 ye kadar tum tamsayilari ekrana yazdiran kodu yaziniz

//        for(int i = 2; i<100; i/=4){
//            System.out.println(i);
//        }

//Increment
        // int i = 12;
        //1) i = i+3
        //2) i+=3//bunu kullanirsan daha tecrubeli gorunursun
        //3) i++ sadece 1 ile artirmada kullanilir
        //4) i = i*3
        //5) i*=3
//Decrement
        //int k = 15
        //1)k=k-7
        //2)k-= 7
        //3)k--
        //4)k=k/3
        //5)k/=3

//Example 4:

//        for(int i = 14; i>4; i--){
//            if(i%2==0){
//                System.out.print(i + " ");
//            }else System.out.print("");
//        }
//        System.out.println();
//Example 6 : 28 den 157 e kadar tum tek sayilari ekrana yazdiran kodi yaziniz
 //       for(int i = 28; i<158;i++){
   //         if(i%2!=0){
//                System.out.print(i);
//
//            }else System.out.print(" ");
//        }

//Example 7: "Java" Stringini "J*a*v*a" Stringine ceviren kodu yaziniz
//String str = "Java";
//for(int i = 0 ; i<str.length();i++){
//    System.out.print(str.charAt(i) + "*");
//}


//Example 8 : "Rip And Tear" ==> "R*p*A*d*T*e*a*r
//        String str = "Rip And Tear";
//        for(int i = 0;i<str.length();i++){
//            System.out.print(str.replace(" ","").charAt(i) +"*");
//        }
//Example 8 size verilen String de tekrarsiz karakterleri ekrana yazdiriniz
// Hellooo Ali ==> HeAi

        String s = "Hellooo  Ali";

        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println(c);
            }

        }
String a = "Ali";
        String b = "ali";
boolean c = a==b;
        System.out.println(c);


















    }
}
