package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Example 1: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        // a-e-i-u-o-A-E-I-U-O

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();



        String harfler[] = str.split("");//split methodu herzaman array verir
        int counter =0;
        System.out.println(Arrays.toString(harfler));
        //3 den fazla ihtimal varsa switch kullanmak tercih edilir
        for(String w : harfler){

            switch (w) {
                case "a":
                case "e":
                case "i":
                case "u":
                case "o":
                    counter++;

            }
        }
        System.out.println(counter);



















    }
}
