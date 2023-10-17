package day26exceptions;

public class Exception04 {

    public static void main(String[] args) {

        int age = 25;
        try{
            printAge(25);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }





    }
    //Yasi ekrana yazdiran bir method olusturunuz

    public static void printAge(int age){

        if(age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk olmaz");
        }
            System.out.println(age);
    }



}
