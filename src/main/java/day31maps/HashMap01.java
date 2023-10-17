package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
  Unique    non-unique

    key       Value
    Cat   =   Kedi
    Dog   =   Kopek

    Key kisminda null tekrarsiz olarak kullanilir
    Value larda null mumkundur
    metodun sol tarafina key, sag tarafina value denir.;
    Map ler key value kullanilir.
    Maplar key value srtuctor ini kullanirlar.
    Value kisminda null bircok kere kullanilabilir
    Mapler hakkinda konusurken map in elemani deme map in entrySet si denir
    Set:Tekrarsiz data demek
    Mapin icindeki entrySet lerin tamami uniquedir cunku baslangic kismi uniquedir
    HashMapler entrySetleri siralama ile ugrasmazlar rastgele siralama yaparlar siralama yapmazlar
    cunku siralama yapmak zaman ister siralam ile ugrasmadiklari icin HashSetler superfast dirler
    1)Mapler key-value structure kullanir
    2)Key ler unique dir
    3)Value lar tekrarli data icerebilir
    4)Map lerde eleman degil EntrySet kullaniriz
    5)key ler de null tekrarsiz olarak kullanilir
    6)Value lar null kabul eder
    7) HashMap ler EntrySetleri herhangi bir siralamaya tabi tutmaz rastgele siralar
    8)Siralama ile vakit kaybetmedigi icin HashMapler cok hizli calisirlar
    primitiveler hicbir collectionda kullanilmaz hata verir

     */
    public static void main(String[] args) {


        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Abuzer",55);
        studentAges.put("Erdal",35);
        studentAges.put("TestereNecmi",25);
        studentAges.put("Tombalaci",45);
        studentAges.put("HusrevAga",65);
        studentAges.put(null,6545);
        studentAges.put("Mehmet Karahanli" , null);
        studentAges.put("Kilic" , null);


        studentAges.put("HusrevAga",65);//ayni key degerini tekrar kullandiginizda hata vermez overwrite yapar
        System.out.println(studentAges);//{null=6545, Erdal=35, Abuzer=55, TestereNecmi=25, Mehmet Karahanli=null, Kilic=null, HusrevAga=65, Tombalaci=45}

        //Mapten keyler nasil alinir ?
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Erdal, Abuzer, TestereNecmi, Mehmet Karahanli, Kilic, HusrevAga, Tombalaci]

        //Map den sadece value lar nasil alinir
        Collection<Integer> values = studentAges.values();
        //Burda collection kullanmamin nedeni values bana collection verdigi icin
        System.out.println(values);//[6545, 35, 55, 25, null, null, 65, 45]

        //Belli bir key e ait value nasil alinir
        Integer age = studentAges.get("Kilic");
        System.out.println(age);//null

        //Example 1: Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz

        Collection<Integer> ages = studentAges.values();
        int counter = 0;
        Integer sum =0;
        for(Integer w : ages){
            if(w!=null){
                sum = sum + w;
                counter++;
            }
        }
        System.out.println("Ortalama yas : " + (sum/counter));//Ortalama yas : 1128
        //int i double a bolersen sonuc double cikar

        //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz
        //         [null, Erdal, Abuzer, TestereNecmi, Mehmet Karahanli, Kilic, HusrevAga, Tombalaci]

        Set<String> names = studentAges.keySet();
        int sum1 = 0;
        for(String w : names ){
            if(w!=null && !w.startsWith("A")){
                sum1 = sum1 + w.length();

            }

        }
        System.out.println(sum1);
        //remove("Erdal" , 35) key si Erdal ve value su 35 olan EntrySet siler ve size boolean verir
        boolean sonuc = studentAges.remove("Erdal",35);
        System.out.println(sonuc);//true(sildi)

        int sonuc1 = studentAges.remove(null);
        System.out.println(sonuc1);

        //Key varsa value yi ver key yoksa sizin istediginiz degeri verir

       Integer sonuc2 = studentAges.getOrDefault("Tombalaci",0);
        System.out.println(sonuc2);
        //Varsa var olan degeri verir yoksa senin koydugun degeri verir

        //putifAbsent;
        //1)Value null ise ekleme yapar value null degil ise ekleme yapmaz
        //2)Key yok ise ekleme yapar
        //Eger value null ise ekleme yap
        Integer sonuc3 = studentAges.putIfAbsent("Acun Ilicali" , 200);
        System.out.println(studentAges);//{Abuzer=55, TestereNecmi=25, Mehmet Karahanli=null, Kilic=null, HusrevAga=65, Tombalaci=45, Acun Ilicali=200}
        System.out.println(sonuc3);

        //replace() method u value lari degistirmek icin kullanilir
        studentAges.replace("Acun Ilicali",49);
        System.out.println(studentAges);//{Abuzer=55, TestereNecmi=25, Mehmet Karahanli=null, Kilic=null, HusrevAga=65, Tombalaci=45, Acun Ilicali=49}

        //replace() methodu value lari key ve alue yu kontrol ettikden sonra degistirdi
        studentAges.replace("Acun Ilicali",49,53);//{Abuzer=55, TestereNecmi=25, Mehmet Karahanli=null, Kilic=null, HusrevAga=65, Tombalaci=45, Acun Ilicali=53}
        System.out.println(studentAges);

        //example 3 : Mapteki her bir entryi ekrana farkli bir satirda olacak sekilde yazdiriniz
        //entrySet() method u Map teki elemanlari bir Set in icine koyarak size verir
        //Map in icindeki elemanlari set in icine koyduktan sonra looplari kullnabilirsiniz
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();

        for(Map.Entry<String,Integer> w : entries){
            System.out.println(w);
        }






























    }











}
