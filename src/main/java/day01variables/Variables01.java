package day01variables;

public class Variables01 {


    //Variable nasıl oluşturulur?
    // 1)Access Modifier  2)Data Type  3)Variable isim  4) "="  5)Değer   6) ";"
    //      public             int            age           =       33        ;
    // Java'da ";" Ingilizcedeki "." ile aynı fonksiyondadır.
    // Ingilizcede "cümle" deriz Java'da "statement" deriz.
    // Assignment Operator = "=".Sağdaki değeri alır soldakinin içine koyar.
    // "=" sembolü "Assignment(Atama) Operator" olarak adalandırılır.
    // Alperen was Here
    /*
    Java'da Data Type'ları
                          Primitive Data Types

    1)int: Integer'in kısaltması.Integer tam sayı dmektir. 32 bit kullanır.
           Matematik'de tam sayıların başı ve sonu yoktur.
           En küçük int = -2.147.438.648
           En büyük int =  2.147.438.648

    2)byte: Tamsayılar icin kullanılır 8 bit kullanır.
                   En küçük byte = -128
                   En buyuk byte =  127

    3)short: Tamsayılar ıcın    16 bit kullanır
             En kucuk deger = -32768
             En buyuk deger =  32767

    4)long: Tamsayılar ıcın 64 bit kullanır



    5)float: Ondalıklı sayılar ıcındır 32 bit kullanır
    "float" vırgulden sonra 7 basamak ıcerebılır.
    "float" dgerlerınde sonuna "f" veya "F" koymanız gerekır

    6)double:Ondalıklı sayılar ıcındır. 64 bit kullanır.
    "double" vırgulden sonra 16 basamak ıcerebılır.
     double daha hassas

    7)boolean: true veya false degerlerı ıcın kullanılır 1 bit kullanır. 1=true 0=false

    8)char: tek karakterler ıcın kullanılır. 16 bit kullanır
    exmp:A,c,2,?,_     under score= "_"
    char lara deger verırken degerı tek tırnak arasına koyunuz.yoksa mokoko.
    note:java buyuk harf kucuk harflere duyarlıdır.Java ıcın "true" ıle "True" tamamen farklıdır
    note:numerıc data types:byte < short < int < long < float < double hangısı memory az kullanır.
    numerıc olmayan data tıplerı:boolean - char

                                      Non-Primitive Data Types

           String: İsim, adres, kimlik numarası bir veya birden fazla karakter ıceren degerlerde kullanılır
           String degerlerı mutlaka cıft tırnak arasına konulmalıdır
           String non-primitive dir.Yani bir String olusturdugunuzda java sıze bır suru method verır

           primitive ile non-primititivelerin farkı nedir?

           1)Non-primitive dta typelarında degerın yanında method lar vardır
           primitive data typelarında ise sadece deger vardır method yoktur
           2)primitive data typeları java tarafından olusturulmustur toplam 8 tanedır,bız prımıtıve data olusturamayız.
           non-primitive'ler java tarafında da olusturulmustur bız de olusturabılırız.non-primitiveler sayılamayacak kadar coktur
           cunku her developer non-primitive daya type olusturabılır.Class OLUSTURMAK NON-PRİMİTİVE DATA OLUSTURMAK
           DEMEKTIR.
           3)Primitive data type ları ısımlendırılırken kucuk harflerle baslar
           non-primitive data type isimleri büyük harfle başlar
           4)primitive data type lar memory de farkılı buyuklukte yerler kullanır
            non-primitive lerin hepsi memory de aynı buyuklukte yer kaplar.
     */

    public int age = 13;

    public int height = 183;

    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99f;

    public double weightOfCell = 0.000001204;

    //Sız "long" demenize ragmen java verilen sayıyı "int" kabul eder.
    //Bu yuzden "long" bır varıable'a "int" aralıgının dısında bır sayı verırsenız sonuna mutlaka "l" veya "L" koyunuz.
    public long populationOfWorld = 70000000000L;
    //Burada "L" koymadıgımız halde problem yok cunku 1234 "int" aralıgına uyar.
    public long x = 1234;

    public boolean isOld = true;

    public boolean isRich = false;

    //initial=ilk harf
    public char initial = 'S';

    public String name = "Tom Hanks";

    public static void main(String[]  args) {
    //note:"main method" arabanın motoru gıbıdır
    //"main method" calısmadan hıcbırsey calısmaz
        System.out.println(Float.MAX_VALUE);

    }





}
