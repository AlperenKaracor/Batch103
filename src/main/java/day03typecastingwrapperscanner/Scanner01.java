package day03typecastingwrapperscanner;



import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanıcıdan data almaya yarar.Scanner kullanıcı ıle etkilesim kurmamızı saglar.
    //Scanner bir Java class'ıdır.bu Class'ı kullanabılmek ıcın "import" etmek gerekir.
    //Scanner Class'ı Javanın util kutuphanesındedır.



    public static void main(String[] args) {
        //Kullanıcıdan data almak için yapılması gerekenler
        //1.Adım:Scanner Class'ından object olusturun

        Scanner input = new Scanner(System.in);

        //2.Adım:Kullanıcıya ne yapacagını soyle
        System.out.println("Yasını gır");
        //3.Adım:Kullanıcıdan aldıgımız data yı bır varıable nın ıcıne koyun
        byte age = input.nextByte();
        System.out.println("senın yasın =" + age);
















    }
}
