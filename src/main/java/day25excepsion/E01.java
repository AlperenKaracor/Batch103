package day25excepsion;

public class E01 {
    /*Exception
    1)nedir:Javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir
    2)Exceptionlar ile calismanin iki yolu vardir
    i)try-catch block kullanma ve exception olussa bile calismayi devam ettirme
    ii)throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod gerego bir dosya uzerinden
    okuma yapmamiz gerekiyor ise bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez)
    3) Eger exception'i handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
    4)try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
    5) try-catch olmaksizin yalniz kullanilamaz.
    6) Eger yazmis oldugumuz herhangi bir kod satirinda problem olabilecegini dusunuyosaniz try-catch block icine koymalisiniz
    7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
    8) e.getmessage() methodunu kullanarak teknik mesajlar elde edebiliriz
    Sout(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
    e.printStackTrace() methodunu kullanrak teknik mesajlar elde dedbiliriz
    ArithmeticException == bu bir data type dir
    System.err.println() hata mesajini renkli olarak verir bu sayede konsolda diger mesajlardan ayirmak icin kullaniriz
    9)Eger try body icindeki kod sorunsuz calisirsa catch blok devreye girmez


     */
    //exectionlarda ana mantik javanin calismaya devam etmesini saglamaktir
    //kodun calismasini devam ettirebilmek icin try-catch kullan
    public static void main(String[] args) {
//        divide(6,2);
//        divide(0,2);
//        divide(6,0);

        //divide2(5,0);
        divide2(12,0);

    }
    //1.Yol Tavsiye edilmez.
    //Bir developer icin tum matematik kurallarini ezbere bilmek gerekmez
    public static void divide (int a, int b){
        if(b==0) {
            System.out.println("Bir sayi sifir ile bolunumez");

        }else {
            System.out.println(a/b);
        }
    }
    //2, yol try-catch kullanarak exceptionu handle etmek tavsiye edilir
    public static void divide2(int a, int b){

        try{
            System.out.println("Hi exception");
            System.out.println(a/b);

            System.out.println("azdan az coktan cok gider");
        }catch (ArithmeticException e){   //'e' alisilagelmis genel kullanim 'a' da yazsan olur ama e gennel
            System.out.println("bolme isleminde bir hata olustu" + e.getMessage());
            e.printStackTrace();/* = java.lang.ArithmeticException: / by zero
            at day25excepsion.E01.divide2(E01.java:48)
            at day25excepsion.E01.main(E01.java:30)*/
            System.err.println("bolme isleminde bir hata olustu");//bolme isleminde bir hata olustu(kirmizi renkte veriyor)Rahatliklar bulabilmek icin

        }
        //java matematik ile ilgili karsilasilmasi muhtemel tum istisnalari hatalari ArithmeticException Class ina koymustur
        //Matematikteki tum istisnalari detaylari bilmek zorunda degiliz
        //Javada ne tur excerptionlarla karsilastin onalrla karsilasinca ne yaparsin
    }
}
