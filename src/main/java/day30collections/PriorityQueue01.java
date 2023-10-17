package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue);//[A, C, B, G, E]
        //Buradaki siralama random degildir javanin belirledigi bir oncelik sirasina gore dizilir
        //Kendimiz siralama mantigi olusturabliriz
        //(oncelik)PriorityQueue Java kendisine gore bir oncelik belirleyerek siralama yapar
        //Biz istersek siralamayi belirleyebiliriz
        //Arrayler ilkel yapidadir o yuzden collectionslara dahil degildir
        //Collections denildigi zaman 3 temel yapi vardir
        /*
        1)list
        2)set
        3)queue
         */












    }

}
