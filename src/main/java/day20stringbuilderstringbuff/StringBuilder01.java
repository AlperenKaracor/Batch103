package day20stringbuilderstringbuff;

public class StringBuilder01 {

    public static void main(String[] args) {

        //StringBuilder Java'da bir Class'dir
        //StringBuilder String olusturmaya yarar
        //String class varken nicin StringBuilder'a ihtiyac duyariz?
        //Cunku StrinClass Immutable Class dir ama biz bazen mutable stringlere ihtiyac duyariz
        //String builder bize mutable string verir  (ROMA BIR GUNDE KURULMADI)
        /*
        Immutable Class larda varolan deger degistirilemez Siz var olan bir degeri degistirmek istedeiginizde ;
        i) Memoryide Yeni bi variable yeni degerle olusturulur
        ii)Eski variablenin pointer i yeni variable a dondurulu
        iii)Eger bir variable i hicbir pointer gostermiyorsa o variable garbage collector tarafindan silinir

        Mutable Class larda var olan deger degistirilebilir orjinal deger korunmaz

        String Class larin immutable yapisi security icin onemlidir
        Ayni degere sahip birden fazla String oldugunda java bir tane container olusturur ve ayni degere sahip String lerin bu
        container in kullanilmasini temin eder Bu memory i korumak icin iyidir ancak contiener daki degeri bir variable
        icin degistirdigimizde tum variable larin
        etkilenmesi tehlikesi vardir.Bu tehlikeden kurtulmak icin java Stringleri immutable(degismez) yapmistir
        Fakat herhangi bir variable nin degerini degistirmek icin java bir yol bulmustur.Degistirmek istediginiz variable icin
        yeni bir container olusturur ve variablenin pointerini bu yeni variable a yonlendirir Boylelikle hem degisim saglanmis hem de digerleri
        etkilenmemis olur
         */
        /*
    1)"StringBuilder" Java'da bir Class'dır
    2)"StringBuilder", String oluşturmaya yarar
    3)"String" Class varken niçin "StringBuilder"a ihtiyaç duyarız?
       Çünkü "String" Class "Immutable Class"dır, ama bazen biz "Mutable String" lere ihtiyaç duyarız.
       StringBuilder bize "Mutable String" verir.
    4)"Immutable Class" larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
         i)Memory'de yeni bir variable yeni değerle oluşturulur
         ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.
         iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

         "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.
 */
//        5) "String Class"ların "imutable" yapısı "security" için önemlidir.
//        Aynı değere sahip birden fazla String olduğunda Java bir tane container oluşturur ve aynı değere sahip String'lerin bu container'ı
//        kullanmasını temin eder. Bu memory'i korumak için iyidir ancak container'daki değeri bir variable için değiştirdiğimizde tüm variable'ların
//        etkilenmesi tehlikesi vardır. Bu tehlikeden kurtulmak için Java, String'leri "imutable"(değişmez) yapmıştır. Fakat herhangi bir variable'ın
//        değerini değiştirmek için Java bir yol bulmuştur. Değiştirmek istediğiniz variable için yeni bir container oluşturur ve variable'ın pointer'ını bu
//        yeni variable'a yönlendirir. Böylelikle hem değişim sağlanmış hem de diğerleri etkilenmemiş olur.


        String str = "Java";
        str = "Super Java";
        System.out.println(str);

        //StringBuilder nasil olusturulur
        //1.yol

        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.yol:
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain
        System.out.println(strb2);

        //StringBuilder larda charactersayisi nasil bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);

        //Capacity asimlarinda capacity var olanin 2 katinin iki fazlasini verir
        int capacity1 = strb3.capacity();
        System.out.println(capacity1);//34 = 16*2+2

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70 = 34*2+2

        //setCharAt(2, 'r'); ==> Index 2 deki character'i "r" ye cevirir
        strb3.setCharAt(2, 'r');
        System.out.println(strb3);//Carxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        strb3.delete(3, 18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        //delete(3 , 18); ==> Index 3(dahil) den index 18(haric) e kadar tum characterleri siler


        //deleteCharAt(2); Index 2 deki characteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse() methodu StrinBuilder i ters cevirir Ali ==> ilA
        //mutable larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir
        //BURASI FARKIN GOSTERILDIGI YER
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

//immutable larda orjinal degeri degistirmek icin methodu kullanmak yeterli olmaz birde atama islemi yapmalisiniz
        //StringBuilder mutable dir
        //String immutable
        String abc = "Java";
        abc.replace("a", "i");
        System.out.println(abc);
//toString methodu StringBuilder lari String e cevirir
        String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3);//Stringe donusturduk

        //String den de StringBuilder a asagidaki gibi donebilirsiniz
        StringBuilder st4 = new StringBuilder(stringstrb3);//Geri donus
        System.out.println(st4);

        //st4.insert(3,"XXXX"); 3. character den sonra "XXXX" leri koyar
        st4.insert(3,"XXXX");
        System.out.println(st4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmaC

        
        //st4.insert(3,"KLMOPQRST",5,8);==> 3. character den sonra "KLMOPQRST" Stringinin index 5,6,7 deki 
        //characterlerini yerlestirir
        
        st4.insert(3,"KLMOPQRST",5,8);
        System.out.println(st4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmaC
        
        StringBuilder a = new StringBuilder("Kava");
        StringBuilder b = new StringBuilder("Java");
        
        int sonuc= a.compareTo(b);
        System.out.println("sonuc = " + sonuc);
        //a.compareTo(b); methodu i)StringBuilder lar tamamiyla ayni ise 0 verir
        //ii) a alfabetik sirada b den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //Alfabetik siralama kurallarini kullanir kucuk harf buyuk harf oldugu zaman ascii degerlere bakar
        //iii)a alfabetik sirada b den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir

















    }
}
