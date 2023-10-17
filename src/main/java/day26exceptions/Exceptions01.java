package day26exceptions;

public class Exceptions01 {
//try calisirsa eger java direk catch e gecer
    //Herhangi bir satirda exception atilirsa java direk catch bolumune gecer try icindeki sonraki kodlari calistirmaz
    public static void main(String[] args) {

        String str = "123";
     int result = covertStringToInteger(str);
        System.out.println(result + 5 );


        String st = "1a2b";
       int r = covertStringToInteger(st);
        System.out.println(r + 10 );

    }
    //NumberFormatException: Eger icinde rakamdan farkli character barindiran bir Stringin
    //            valueOf() kullanrak Integer e cevirmek istersniz NumberFormatException alirsiniz
    public static int covertStringToInteger(String str){

        int i = 0;
        try {
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");
        }catch (NumberFormatException e ){

            System.out.println("Hata");
        }

        return i;









    }



}
