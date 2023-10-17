package day27exceptions;

public class Exceptions01 {
//Kod yazarken her halukarda bir fiilin yapilmasini istiyorsaniz o fiili finally nin
// suslu parantezinin arasina yazmaniz gerekir
    /*
    interviwew
    "final" "finally" "finalize" aciklayiniz
    1)"final" bir keywordur variable Class ve methodlar icin kullanilir
    2)finally" bir kod bloktur
    "try catch" veya sadece try ile kullanilir
    finally kod block icine yazilan kodlar her halukarda calistirilir en sona koyariz
    mesela database ile connectionu kesmek her halukarda yapilmasi gerekn bir diildir bunu finally ile yapabiliriz
    3)"finalize" bir method dur bu method java tarafindan datalar imha edilmeden once cagirilir bu method datalari imha edilecek
    hale getirir ve daha sonra garbage collector bu datalari imha eder
    finalize methodunu java developer lar da cagirabilir ama java kendi bildigini yapar
    "final" keyword
    i)Variable larda kullanilabilir
    public final int age=12;
    Atanan deger degistirilemez
    Deger atamasi yapilmak zorundadir
    ii)Methodlarda kullanilabilir
    public final int add(){
    return a+b;
    a)bir method olusturulurken final olarak olusturulmus ise
    o methodun body si asla degistirilemez Dolayisiyla o method override edilemez
    iii)Class larda kullanilabilir
    Bir class i final yaparsaniz o class i kisirlastirmis olursunuz
    Bir class final ise o class a extend edilemez
    final class child olablir


     */
    public static void main(String[] args) {
        double r1 = compareNumOfCharacters("java", "xy");
        System.out.println(r1);

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("java", "");
        System.out.println(r3);



    }
    //Verilen iki Stringden birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz

    public static double compareNumOfCharacters(String s, String t) {
        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("lenght() methodu null ile kullanilamaz");
        } catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayi 0 ile bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }

        return result;


    }


}
