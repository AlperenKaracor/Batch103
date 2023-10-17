package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {
//1 METHOD 1 ACTION
        //Kucuk kucuk methodlari istedigin gibi birlestirerek kod yaz atomic yapida olsunlar
        LinkedList<String> names = new LinkedList<>();//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);
        /*
          Retrieves, but does not remove, (first element) of this list.
         Returns : the first element of this list or null if this list is empty
         */
        String firstEl = names.peek();
        System.out.println(firstEl);//Chris

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);//null
//     Retrieves and removes  (first element) of this list.
//     Returns:the head of this list, or null if this list is empty
        String firstElement = names.poll();
        System.out.println(firstElement);//Chris

        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]
//      Retrieves, but does not remove, the head (first element) of this list.
//      Returns:the head of this list
 //     Throws:NoSuchElementException – if this list is empty
        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]
//        Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
//        Returns:the first element of this list, or null if this list is empty

        names.peekFirst();

        //Example 1: "A" ile baslayan tum isimleri  "*****" e ceviriniz

        LinkedList<String> students = new LinkedList<>();//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        for(String w : students){

            if(w.startsWith("A")){
                students.set( students.indexOf(w) , "*****" );
            }
        }
        System.out.println(students);//[Chris, *****, Mark, Tom, Jeremy, Hans]

        //INTERVIEW SORUSU :Exapmle 2 : List'deki 4 harfden cok harf iceren isimleri siliniz
        //Eleman sayisiniz azaltacagimiz icin i ye ihtiyacimiz var o yuzden for each loop degil for loop kullaniyoruz

        for(int i =0; i<students.size(); i++){

            if(students.get(i).length()>4) {
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);//[Mark, Tom, Hans]








    }
}
