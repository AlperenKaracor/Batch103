package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //Object nasıl olusturulur??
        //1)Class ısmını yazınız  //2)Objeye ısım verınız  3) =       4)new keyword'unu kullan  5)class ısmı parantezle beraber kullan(constructor)

                   Car                      myHonda           =                 new                                Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();
                   //MethodCreation class ından obje olusturduk
        MethodCreation ufuk = new MethodCreation();
        System.out.println(ufuk.toplamaYap(5,2));

    }




    public void hareketEt() {
        System.out.println("Honda adamdır");
    }

    public void dur(){
        System.out.println("Honda güvenli durur....");
    }







}