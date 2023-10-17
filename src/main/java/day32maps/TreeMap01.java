package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1)TreeMapler entrySet leri key lere gore natural order da siralar
    2)TreeMapler en yavas maplerdir (sirlaam ile ugrastiklari icin)
    3)TreeMapler treath-safe ve syncronized degildir
     treath-safe ve synchronized lazimsa tek opsiyon hashTable
    elemelar sirali istiyorsan tek opsiyon treeset
    eger hiz onemli ile hashmap
     */


    public static void main(String[] args) {


        TreeMap<String, Double> salaries = new TreeMap<>();

        salaries.put("Tom Hanks" , 3000.00);
        salaries.put("Mary Star" , 1000.00);
        salaries.put("Jimmy Jones" , 5000.00);
        salaries.put("Abuzer Komurcu" , 6000.00);

        System.out.println(salaries);//{Abuzer Komurcu=6000.0, Jimmy Jones=5000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        SortedMap<String, Double> map1 = salaries.tailMap("Abuzer Komurcu");

        //tailMap() verilen key den baslayarak sona kadar tum entry leri size verir
        System.out.println(map1);
        //tailMap: yazdigin keyden baslar sonuna kadar tum elemanlari sana verir
        NavigableMap<String,Double> mp2 = salaries.tailMap("Abuzer Komurcu",false);
        System.out.println(mp2);
        //tailMap(String,false); verilen key den baslayarak sona kadar tum entry leri size verir ama sizin verdiginiz key i haric tutar

        NavigableMap<String,Double> mp3 = salaries.subMap("Abuzer Komurcu",true,"Tom Hanks",false);
        //{Abuzer Komurcu=6000.0, Jimmy Jones=5000.0, Mary Star=1000.0}
        System.out.println(mp3);

        //lowerEntry("Mary Star") Mary Star'dan bir öncekini verir.
        Map.Entry<String,Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4);

        //lowerEntry("Paris Hilton") Paris Hilton'dan bir öncesini verir, Paris Hilton olmasa da sanki varmış gibi davranır.
        Map.Entry<String,Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);// Mary Star=1000.0

        //higherEntry("Mary Star") Mary Star'dan bir sonrakini verir.
        Map.Entry<String,Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println(map6);// Tom Hanks=3000.0

        //ceilingEntry(); var olan key ile kullanılırsa o key'i verir. Var olmayan bir key ile kullanılırsa bir sonrakini verir.
        Map.Entry<String,Double> map7 = salaries.ceilingEntry("Mary Star");
        System.out.println(map7);// Mary Star=1000.0

        Map.Entry<String,Double> map8 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map8);// Tom Hanks=3000.0

        Map.Entry<String, Double>  map9 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map9);// Tom Hanks=3000.0

        Map.Entry<String, Double>  map10 = salaries.floorEntry("Mary Star");
        System.out.println(map10);// Mary Star=1000.0

        Map.Entry<String, Double>  map11 = salaries.floorEntry("Paris Hilton");
        System.out.println(map11);// Mary Star=1000.0


    }



}
