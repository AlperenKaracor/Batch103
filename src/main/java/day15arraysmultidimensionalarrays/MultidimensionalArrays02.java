package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {

        //MultiDimensionalArray kisa yoldan nail olusturulur

        char arr[][] = {{'a','b'}, {'C','D','E'}, {'?'} };

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]

        //Bir String multidimensional array de icinde "a" olan elemanlari concole yazdiriniz

        String brr[][] = {{"learn","java","it"},{"is","easy"} };

        for(String[] w : brr){

            for(String k : w){

                if(k.contains("a")){
                    System.out.println(k + " ");
                }

            }
            

        }







    }
}
