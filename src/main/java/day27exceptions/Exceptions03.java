package day27exceptions;

public class Exceptions03 {
    /*
    1)Java Exception lar olusturarak Developerlarin Java kurallarina uymanlarini temin etmistir
    2)Biz de Application uretirken kendi Exceptionlarimizi olustuarak diger developerlarin bizim ortaya koydugumuz kurallara
    uymalarini temin ederiz
    3)Bizim urettigimiz Exceptionlara custon exception denir.
    Custon Exceptionlar : Javanin degil developerlarin urettigi Exceptionlardir
     4)Custom exceptionlar da runtimeExeption ve CompileTimeException olabilir
     5)Custom RuntimeException uretmek icin extends RuntimeException deriz
     6)Custon CompileTimeException uretmek icin extends Exception deriz
     */

    public static void main(String[] args) throws IllegalGradeException {

        printGrades(14);
        checkNameFormat("Ali");


    }

    //ogrenci Notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade < 0 || grade > 100) {
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");

        } else {
            System.out.println(grade);
        }
    }
//Verilen ismin ilk harfinin buyuk harf olmamasi durumunda Exception atan method yaziniz

    public static boolean checkNameFormat(String name) {
        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            return true;

        } else {
            throw new IlllegalNameExcpetion("isimler buyuk harfle baslamalidir");
        }
    }

}
