package day26exceptions;

public class Exception03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d);

        divideStringByTheNumOfTheChar(null);

    }

    //String deki character sayisini bulunuz String i integer e ceviriniz  Integer i character sayisina bolunuz

    public static double divideStringByTheNumOfTheChar(String str) {
        int lenght = 0;
        int i = 0;
        double sonuc = 0;
        try {
            lenght = str.length();//NullPointerException : "null" Stringle "lenght()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException : icinde rakamdan farkli character olan Stringler valueOf() ile kullanildiginda
            sonuc = i / lenght;//ArithmeticException : Bolen sayi 0 oldugunda alinir
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;

    }
    //Eger ozel bir uygulama istenmiyorsa bu uygun gerekiyorsa ozel ozle senaryolar icin coklu catch kullan
    public static double divideStringByTheNumOfTheCharacter(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir
        }catch(Exception e){//Exception butun exceptionlari halleder 911 gibi,Exception diger butun exceptionlarin parent classidir
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    public static double divideStringByTheNumOfTheCharacters(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();
            i = Integer.valueOf(str);
            sonuc = i / length;
        }catch(NullPointerException e){

            System.out.println("NullPointer a ozel");
        }catch (Exception e){
            System.out.println("Diger tum Exceptionlar icin");
        }
        return sonuc;
    }
//coklu catch kullandginda child i alt tarafa koyarsan hata alirsin gelen butun hatalari exception parent class i yukarida yakalar asagidakine
   // yani child a birsey kalmaz parent child exceptionlari bir arada kullandiginda child i yukaris koy aralarinda child parent iliskisi yoksa
    // siralama fark etmez
    /*
    Note: 1)Aralarinda parent child realtionship olan exception class lari mulltiple catchlerde kullanmak isterseniz
    "child" olan once kullanilmalidir aksi taktirde hata verir
    2)Aralarinda parent-child relationship olmayan exception class lari multiple catch lerde kullanmak isterseniz
    siralamanin bir onemi yoktur
     */



}
