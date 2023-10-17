package day32maps;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iteratiors02 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example : Iterators kullanarak list elemanlarini tersten konsola yazdiriniz
        ListIterator<String> itr = myList.listIterator();
  //hasNext() method u pointer dan sonra eleman varsa true yoksa false return eder
        //next() methodu pointer i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder
        while(itr.hasNext()){
            itr.next();
        }
//hasPreivous() methodu pointer dan once eleman varsa true yoksa false return eder
        //previous() methodu pointer i bir onceki elemanin sonuna koyar ve ustunden atladigi elemani retun eder
        while(itr.hasPrevious()){

            String el = itr.previous();

            System.out.print(el + " ");

        }
        //Example 2 : List deki tum elemanlari silin

    }







}
