package day14ArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrays'lerin icine sadece "primitive data type" leri ve reference'ler konabilir

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprised you";

        System.out.println(Arrays.toString(str));

        //Example 1)String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr[] = {"Jane","Mark","Christopher","Tom","Ali","Rojda"};

        for(String w : arr){

            System.out.print(w + " ");

            if(w.equals("Tom")){
                break;
            }
        }
        System.out.println();
//String bir Array olusturunuz ve "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz

        String brr[] = {"Jane","Mark","Christopher","Tom","Ali","Rojda"};

         for(String w : brr){

             if(w.equals("Tom") || w.equals("Jane")){
                 continue;
             }
             System.out.print(w + " " );
         }

        System.out.println();
//Example 3:Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz
        //Bir ogretmenin sinifindaki ogrencilerin isimlerini applicationa yuklemesini saglayan kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz ?");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine bas ");

        for(int i= 1; i<=numOfStd; i++){

            System.out.println("Lutfen " + i + " . ogrenci ismini giriniz");


            String stdNmes = input.next();


            if(stdNmes.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdNmes;

        }
        System.out.println(Arrays.toString(names));

//1 kere yaz calistigina emin hemen yollama sonra bir kahve ic dinlenmis kafayla gel yazdigin koda bir daha bak
//update olacak birsey varmi sonra dinlen bir daha bak calisan kod yazmak yetmez
//kod kaliteli olmali kod standartlarina uymali
















    }
}
