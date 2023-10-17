package day25excepsion;

public class E03 {

    public static void main(String[] args) {
        String str = "Rip";

        getNumOfChars(str);//3

        String s = "";
        getNumOfChars(s);

        String t = null;
        getNumOfChars(t);//NullPointerException
        //eger length() methodunda null kullanirsaniz bu exceptation i alirsiniz


    }

    //Bir String te bulunan karakterlerin sayisiniz bulabilmek icin bir method olusturunuz
    public static void getNumOfChars(String str){

        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println("Lenght() methodunda bir problem olustu  /"+e.getMessage());
            e.printStackTrace();
            //bu methodu kullandiginiz zaman System.out.println() kullanmaniza gerek yok
        }


    }


}
