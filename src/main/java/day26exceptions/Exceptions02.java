package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        char ch1 = getCharFromString("RipAndTear",2);
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException : Eger bir Stringden character/ler alirken olmayan bir index kullanilirsa alinir
        //Bir var olmayan index i  kullandiginizda bu hatayi alirsiniz
        //Kitap gibi ezberleyip gitme interview a pratik ile cik yasamis olarak cik

    }

    public static char getCharFromString(String str, int idx){//sana ne lazimsa buraya yaz method olustururken
        char c = ' ';

        try{
            c =str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Hata");

            System.out.println(e.getMessage());//genelde bu kullanilir

            e.printStackTrace();//INT sorusu :BIr hata olustugunda ne yaparsin :log lara bakarim alt taraftaki akis demek log
            //Hata loguna bakar hatayi tespit eder anlar ve cozer loglara bakar
        }

        return c;



    }



}
