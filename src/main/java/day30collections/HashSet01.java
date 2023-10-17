package day30collections;

import java.util.HashSet;

public class HashSet01 {

    public static void main(String[] args) {

       /*
       hash bir tekniktir birbirine benzemeyen code lar uretir bu code lar datayi unique yapar
       Set lere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz ornk : ogrenci no
        */


        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]
        //setlere ayni elemani eklersen hata vermez bir oncekinin ustune aynisini yazar
        //var olan elemani eklerseniz hata vermez son ekleneni var olan datanin ustune yazar (Override)
        //interviewde garantik cikar collectionlar
        //setler coklu ama tekrarsiz datalari depolamak icin kullanilir
        //hashsetlere null eklemek mumkundur ama 1 kere ekleyebilirsiniz daha sonraki eklenenleri digerinin ustune yazar
        //HashSet ler eklenen elemanlarin siralamasi ile ugrasmaz sirlama ile ugrasmadigi icin cok hizli calisir
        //HashSet siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir
        //tekrarsiz elemanlarda kullanilir siralama onemli degilse hiz onemli ise hash set kullan
        //Hashsetler index kullanmazlar sirlamayi kafasina gore yapar

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);

        /*
        HashSetler index kullanmazlar Cunku siralama rastgele yapildigi icin index manali olmaz
       HashSetler:
       1)tekrarsiz elemanlarda
       2)sıralama onemli degilse
       3)hız cok önemliyse
       4)İndeks kullanmazlar
         */






    }
}
