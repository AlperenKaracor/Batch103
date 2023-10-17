package day32maps;

import java.util.Hashtable;

public class HashTable01 {
/*
   1)HasTable bir map'tir.,
   2)HasTable entrySet'leri herhangi bir sıralamaya tabi tutmaz.
   3)HasTable,HashMap'lerden daha yavaştır çünkü HasTable lar thread-safe
   (aynı andan birden fazla iş yapabilme becerisi) ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
   1)HashTable bir map dir
   2)HashTable entrySet leri hrhangi bir sirlamaya tabii tutmaz
   3)HashTable HashMap lerden daha yavastir Cunku HashTable lar thread-safe ve synchronized dir
   (threadSafe ayni anda birden fazla is yapabilme)
   (synchronized  zamandan safe etmek icin coklu islerin mantikli bir siraya tabi tutulmasi)
   4)HashTable larda key null olamaz Key i null yaparsaniz NullPointerException atar
   5)HashTable larda value null olamaz Value yu null yaparsaniz NullPointerException atar
   HashMap ve HashTable farki 2 emel farki var:
   1)Hashmap treat safe ve sync degildir hashtable oyledir
   2)hashmaplerde null hem key hemde value larda kullanilabilir hash table larda kullanilamaz
   toString ne ise yarar :toString olmazsa stack memoryrideki adresi gorebilirsin sadece

   Note: toString() method u obje leri console da detaylari ile gorebilmek icin class larin icinde olusturulur
         toString() method unu olusturmadan objecti console yazdirirsaniz Java o objelerin adresini yansitir


 */
    public static void main(String[] args) {

        Hashtable<String,Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA" , 4000);
        countryPopulations.put("Germany" , 8300);
        countryPopulations.put("Turkiye " , 8000);
        System.out.println(countryPopulations);

        //countryPopulations.put(null, 9000);//HashTable larda key null olamaz NullPointerException
        //countryPopulations.put("France",null);//HashTable larda value null olamaz NullPointerException

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math" , new Students("Tom Hanks","th@gmail.com",21,true));

        System.out.println(myStudents);

       String name = myStudents.get("Math").name;

        System.out.println(name);//get methodu key ile calisir

       int age =  myStudents.get("Math").age;

        System.out.println(age);
//tree kelimesini duyunca akliniza natural order gelicek ne demek stringlerde alfabetik siralama sayilarda kucukten buyuge siralama demek



    }


}
