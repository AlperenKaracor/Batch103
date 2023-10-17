package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        //Isimlerin T ile baslamasinda ozel bir neden yok
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]


        List<String> cities = new ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);//removeAll() kullandigimizda sadece ilk list degisir parantezin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);//[Trump, Tom, Taceddin]
        //Arraylerde length kullanilir Listlerde size()

        List<String> myNames = new ArrayList<>();


        myNames.add("Thomas");
        myNames.add("Tahsin");
        boolean sonuc1 = names.containsAll(myNames);
        System.out.println(sonuc1);
//containsAll u kullandigimizda hepsi varsa true alirsiniz yoksa false alirsiniz
     /*         Bir listin icinde coklu elemanlarin var olup olmadiginiz kontrol eder
                hepsi varsa true en az biri yoksa false verir
                Stringlerde buyuk kucuk harf farkeder

*/
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example 1)  'a' listinde Shoes elemaninin ilk gorunumunu silin

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2)  'a' listinde Shoes elemaninin tum gorunumunu silin
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]
       // removeAll kullanacagin zaman yeni bir list olusturmak ZORUNDASIN

        //Example 3: Bir tane salary listi olusturun eger salary 10000 ve 10000 den az ise %20 100 den cok ise %10 zam yapiniz

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        for(Double w : salary){

            if(w<10000){

                salary.set(salary.indexOf(w), w*1.2);
            }else{
                salary.set(salary.indexOf(w), w*1.1);
            }
        }
        System.out.println(salary);

//Example 4: iki Arraylist in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: 2 ArrayList in esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni index te olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');


        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

     //1.way
        int counter = 0;//flag kullanmak denir


     for(int i = 0;i<m.size();i++){

         if(m.size() != n.size()){
             counter++;
             System.out.println("Listler ayni degildir");
             break;
         }else  if(m.get(i) != n.get(i)){
             counter++;
             System.out.println("Listler esit degildir");
             break;
         }
     }
     if(counter==0){

         System.out.println("Listler esittir");

     }

     //2.Yol:
        boolean esitmi = m.equals(n);

     if(esitmi){
         System.out.println("Listler esittir");
     }else{
         System.out.println("listler esit degildir");
     }



















    }
}
