package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
/*
Ilk giren elemani ilk kullanmaniz(First In First Out ==> FIFO) grektiginde Queue en iyi secimdir
Queue da elemanlar Insertion Order a gore dizilirler
Queue da peek() pall() element() gibi ilk elemani ilgilendiren bircok methot vardir
offer() methodu kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir
Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
         Kapasite kısıtlamalı bir kuyruk kullanırken, bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca bir istisna atarak bir öğe eklemede başarısız olabilir.
         Döndürür: öğe bu kuyruğa eklendiyse true, aksi takdirde false
         Atar:
         ClassCastException – belirtilen öğenin sınıfı, onun bu kuyruğa eklenmesini engelliyorsa
         NullPointerException – belirtilen öğe boşsa ve bu sıra boş öğelere izin vermiyorsa
         IllegalArgumentException – bu öğenin bazı özellikleri onun bu kuyruğa eklenmesini engelliyorsa
 */
    /*
    İlk giren elemanı ilk kullanmanız(First In First Out ==> FIFO) gerektiğinde Queue en iyi seçimdir.
    Queue'da elemanlar "insertion order" a göre dizilirler.
    Queue'da pop(), peek(), poll(), element(), remove() gibi ilk elemanı ilgilendiren birçok method vardır.
 */
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes]
        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        Returns:
        true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        //Kapasite uygunsa ekleme yapar
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes, Potatoes]





    }
}
