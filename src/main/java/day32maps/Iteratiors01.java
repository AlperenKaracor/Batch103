package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iteratiors01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for loop kullanrak her elemanin sonuna unlem isareti ! ekleyiniz

        for(String w : myList ){
            w = w + "!";
        }

        //Note:Looplar kendi baslarina collection lari update edemezler
        //Bu yuzden Java iterator lari olusturdu iteratiorlar collection lari update etmek icin kullanilir

        ListIterator<String> itr = myList.listIterator();
        //iteratiorlarda while cogunlukla kullanllir

        while(itr.hasNext()){
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);










    }
}
