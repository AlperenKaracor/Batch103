package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //binarySearch() Method : Bu methodu kullanrak bie elemanin Array'de olup olmadigini anlariz
        //binarySearch() Methodunu kullanmadan once mutlaka Arrays.sort() kullanmalidir
        //Arrays.sort() kucukten buyuge dizer
        //binarySearch() Methodu aradiginiz eleman Arrayde varsa o elemanin indexini return eder
        //!!ANA KOD YAZILDIKTAN SONRA DEGISTIRILMEZ ANA KODA DOKUNMA DEGISTIRILECEK SEYLERI AYRI YERE KOY
        //binarySearch() Methodu aradiginiz eleman array de yoksa
        //binarySearch() Methodu 2 parametre ile calisir 1. parametre array in ismi 2.parametre aradigimiz sayi
        //binarySearch() Methodu aradiginiz eleman Arrayde yoksa "-a" seklinde bir negatif sayi alirsiniz
        //binarySearch() Methodu Bu sayidaki "-" isaretinin anlami bu eleman Array de yok demektir "a" nin anlami olsaydi kacinci sirada olurdu demektir
        ////binarySearch() Methodu tekrarlayan elemanlar icin kullanilmaz



        int arr[] = {12, 31, 43, 14};

        int sayi = 43;

        Arrays.sort(arr);// {12, 14, 31, 43}

        int idx1 = Arrays.binarySearch(arr,sayi);

        System.out.println(idx1);

        int sayi2 = 58;

        int sonuc = Arrays.binarySearch(arr,sayi2);

        System.out.println(sonuc);//-5 verdi '-' nin anlami o eleman yok demektir.
                                   //5 in anlami da olsaydi hangi SIRADA olurdu







    }

}
