package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        //Bir tane integer multidimensional array olusturunuz
        //Bu array deki tum sayilarin toplamini veren kodu yaziniz

//        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
//
//        int sum = 0;
//
//        for(int[] w : arr){
//
//            for(int k : w ){
//
//                sum = sum + k;
//
//            }
//        }
//        System.out.println(sum);

//Eger elinde array varsa for each loop kullan ama elinde hem array hem de index varsa for each loop kullanma
        //cunku for each loop index kullanmaz
        /*Array veya collection varsa "for-each loop kullanmak ilk tercihiniz olsun
        Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each loop" calismaz
        "for-loop" veya "while-loop" veya "do while loop" kullanilir
     */
        //Example 2 :Bir multidimensional array'i normal array e ceviren kodu yaziniz
        //{ {2, 5, 1}, {32, 75} } ==> {2, 5, 1, 32, 75}
        int brr[][] = {{2, 5, 1}, {32, 75}};

        int toplam = 0;

        for(int[] w : brr){
            toplam = toplam + w.length;
        }
        System.out.println(toplam);
        int idx = 0;
        int crr[] = new int[toplam];

        for(int[] w : brr){

            for(int k : w){
                crr[idx] = k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(crr));








    }

}
