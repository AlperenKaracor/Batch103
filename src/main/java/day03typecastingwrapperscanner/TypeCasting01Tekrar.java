package day03typecastingwrapperscanner;

import java.util.Scanner;

public class TypeCasting01Tekrar {

    public static void main(String[] args) {
        byte age = 23;

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;

        float price = 12.99F;
        byte newPrice = (byte)price;
        System.out.println(newPrice);

        byte pB = 12;

        Byte wB = 12;

        float f1 = 13.99F;

        Float wf1 = f1;
        Scanner amk = new Scanner(System.in);

        System.out.println("Bir teselli ver: ");
        String teselli = amk.nextLine();
        System.out.println(teselli + " eyvallah ");
















    }
}
