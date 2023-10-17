package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {
        /*
        Javada tree kelimesi alfabetik siralama ya da  kucukten buyuge siralama anlamina gelir
        TreeSet tekrarsiz elemanlari alfabetik veya kucukten buyuge(Natural order) dizer
        NatrualOrder ciddi emek ister
        TreeSet cok cok cok yavas calisir
        TreeSet i kullanirken 2 kere dusunmelisin gercekten alfabetik siralama ve kucukten buyuge siralama sart mi
        */
//MESHUR BIR INTERVIEW SORUSU
        /*
        Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir ama TreeSetler cok yavas calistigi icin
        biz elemanlari once hashset e depolariz sonra hashset i treeset e cevirerek treesetin yavas olma problemini asmis oluruz
         */
        //elemanlari eklemede hastseti kullanirim sonra hashseti tree sete ceviririm boylelikle elemanlar siralanmis olur
        //Example 1: 8 tane unique String elemani alfabetik sirada depolayiniz
        //1.yol
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);
//2, yol cok daha guzel cunku hashSet in hizindan ve tree setin siralamasindan kullaniyorum
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        TreeSet myEmailsSorted = new TreeSet(myEmails);
        System.out.println(myEmails);
        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end1-end2);




    }
}
