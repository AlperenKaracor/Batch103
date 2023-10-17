package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {


        /*
        verilen yilin leap year olup olmadigini kontrol eden kodu yaziniz
        1)Yil 100 e bolunurse 400 e de bolunmelidir
        2) yil 100 e bolunmezse 4 e bolunmelidir
         */
        int year = 1600;
        String leap = year%100==0 ? (year%400==0 ? "leap year" : "leap year degil") : (year%4==0 ? "leap year"  :  "leap year degil ");
        System.out.println(leap);

/*
Asagidaki kurallara gore password un gecerli olup olmadigini kontrol eden kodu yaziniz
1)sekiz karakterden fazla veya sekiz  karakter varsa ilk harfi 'i' olmalidir
2)skiz karakterden az varsa ilk harfi 'K' olmalidir
 */

        String pwd = "K2a3ed";
char u = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (u =='K' ? "Gecerli " : "Gecersiz") : (u =='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);











    }



}
