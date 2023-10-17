package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    /*
    Array listler ayni data typenina sahip birden fazla datayi depolamak icin kullanilir
    !!!!!!INTERVIEW SORUSU = Array ile Arraylist'in farki nedir?
   bu birinci fark javanin arraylistleri olusturmasinin sebebidir
   1)Array olusturuken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz,soyledigimiz eleman sayisindan fazla eleman koyamayiz
      Arrayler eleman sayisinda 'fixed' dirler!!!BUYUK PROBLEM)Arrayin sayisini her buyutmede memory ide fazla yer kaplama olur

      Arraylist'leri olustururken eleman sayisi soylemeye gerek yok cunku Arraylist'ler eleman sayisinda 'flexible'(esnek) dirler
      2)Arraylerin icine primitive ve reference ler konulabilir
      Arraylist'lerin icine ise sadece non-primiviteler konur.
      3)Arrayler superfast dir cok hizlidir ,Arrayler memoryi cok az kullanir
      Note:Eleman sayisi kesin belli olan coklu datalari depolamak icin array kullaniriz
      Ama eleman sayisi degisken olan coklu datalar icin array kullanma riskini almayin
      Arraylerdeki method sayisi ArrayListlere gore daha azdir
      Arrayleren sadce primitive data typelari ve referenceleri koyabilirsiniz
      ArrayListler sadece non-primitiveler ile calisir
      Arrayler daha hizli calisir cunku daha basit bir yapilari vardir ve memoryde daha az yer kaplarlar
      Eleman sayisinin degismeyecegine eminseniz array kullanmak daha iyidir hizli olacagi icin

     */
    public static void main(String[] args) {

        //ArrayList nail olusturulu?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3.yol
        List<Integer> nums = new ArrayList<>();
        //Genelde 2. ve 3. kullanilir. 3. daha kisa oldugu icin kullanmak daha mantiklidir.

        //ArrayList'ler nasil yazdirilir
        //Sadece isimini koymak yeterlidir
        System.out.println(nums);

        //ArrayList'lere nasil eleman eklenir?

        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);// [21, 18, 20]
        //add() elemani her zaman en sona ekler bir method verdiginiz elemanlari ekleme sirasina gore diziyorsa ona insertion order denir yerlestirme sirasina gore dizer

        nums.add(1,50);//Hicbirsey return etmez data tipi void oldugu icin void data type bu method hicbirsey return etmez demek
        System.out.println(nums);//[21, 50, 18, 20]
        //add() methodu boolean return eder
        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println(nums);//[21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        nums.addAll(2,prices);
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasil bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);//8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() istenen bir indexteki elemani verir
       int eleman1 = nums.get(3);//185
        System.out.println(eleman1);

        //ArrayList in bos olup olmadigini nasil anlariz?
        boolean a = nums.isEmpty();
        System.out.println(a);

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);

        //ArrayList'de bir eleman nasil degistirilir?
         nums.set(3, 200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]
        //set() varolan birseyi degistirmek yeni birseye donusturmek

        //Example 1: nums ArrayList'indeki tum sayilari 11 arttirdiktan sonra ekrana yazdiriniz
        //List gordugunuzde loop kullanman gerekiyorsa for each loop kullan
        for(int w : nums){
            if(w%2!=0){

                nums.set(nums.indexOf(w), w+11);
            }
        }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]
        //remove() icine tam sayi koyarsaniz java onu index olarak kabul eder
        //Example 2) ArrayList den 200 elemanini siliniz
        Integer sayi = 200;
        nums.remove(sayi);// ustu cizili bu kullaniliyordu hala kullaniliyor ama yeni versiyonlarda kaldirildi yakin zamanda bunu silicem alisma
        System.out.println(nums);//[32, 50, 34, 18, 20, 34, 196]
        //butun tam sayilar java tarafindan primitive kabul edilir memory yi korumak icin non-primitiveleri index kabul etmez java
        //Note Tum tam sayilar aksi soylenmedikce primitivedir yani "int"dir
        //Note2:"primiteveler ArrayListlerin elemani olamazlar , listler non-primitive depolar
        //Note3: primitive wrapper class a cevirirseniz non-primitive olur ve non-primitiveler Array listlerin elemani olur index olamaz
        //Note4:remove() ilk gorunumu siler

    }
}
