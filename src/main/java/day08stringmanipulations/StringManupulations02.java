package day08stringmanipulations;

public class StringManupulations02 {

    public static void main(String[] args) {


        //Example 1:Bir Stringdeki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //    "ali okula gitti." ==> 14
        String str = "Ali okula gitti.";

        int num = str.replace(" ", "").length();

        System.out.println(num);
//replace() method'u bit String deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.

        //Example 2 : Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.
        String s = "Ankara'nin tasina gozlerinin yasina bak.";
        String a = s.replace("a", "A");
        System.out.println(a);

        //Example 3: Bir String'deki tum 'kara' kelimelerinin yerine "*"

        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);
//Example 4 : Bir Stingdeki tum sayilari "*" a ceviriniz.
        // AC25234234234  ==>   AC***********
        String stdId = "AC202123234";

        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);
        //Bir grup daya'yi ifade eden kod lara "Regex" denir
        // "Regex" Regular Expressions in kisaltilmis halidir

        //Ornek regex
//        1)tum rakamlar ==> [0-9]
//        2)tum kucuk harfler ==> [a-z]
//        3)tun buyuk harfler ==> [A-Z]
//        4)tum hafler ==> [a-zA-Z]
//        5)Sesli harfler ==> [aeiouAEIOU]
//        6)Space ==> [ ]
//        7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
        //8)Tum noktalama isaretleri ==> \\p{Punct}
        //1)Rakamlar haric tum karakterler ==> [^0-9]
        //2)Kucuk harfler haric tum karakterler ==> [^a-z]
        //3)Buyuk harfler haric tum karakterler ==> [^A-Z]
        //4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
        //5)Space haric ==> [^ ]

        //Example 5 Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri hariz
        //tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
//[^\\p{Punct}] noktalama isaretleri haric demek

        System.out.println(sonuc);
        //Example 8 : Verilen bir String "Al" ile basliyor ve " x" ile bitiyorsa ekrana " harika" yazdirin.
        // aksi halde normal yazdir
        String v = "Kalex";
        boolean baslangic = v.startsWith("Al");

        boolean bitis = v.endsWith("x");

        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);

        /*
         //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli
         */
        String pwd = "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);


















    }
}
