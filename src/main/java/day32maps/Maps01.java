package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {

    public static void main(String[] args) {

        //MESHUR BIR INTERVIEW SORUSU
        //Size verilen bir cumledeki her kelimenin kac kere kullanildiginiz goteren kodu yaziniz
        //"I like to move it, move it." ==> I=1  like=1 to=1 move=2 it=2 bu yapiyi gorun ce yani key value yapisii aklina map gelsin


        String str = "I like to move it, move it.";
        //Noktalam isaretlerini sil 1.Adim. Silmezsen eger Java farkli kelime gibi dusunur

        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str);//I like to move it move it
        //Eger kelimelerle calisacaksan noktalama isaretlerini silmek zorundasin

        //2.Adim :Kelimeleri almak icin split() methodunu kullan
        String[] kelimler = str.split(" ");
        System.out.println(Arrays.toString(kelimler));//[I, like, to, move, it, move, it]

        HashMap<String,Integer> gorunum = new HashMap<>();//{               }

        for(String w : kelimler){
            //get eger bu kelime kullanilmissa value verir kullanilmamaissa null ver ya kullanim sayisini verecek ya null verecek
            Integer gorunumSayisi =gorunum.get(w);
            if(gorunumSayisi==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayisi+1);
            }//put map in icine git I yi su sekilde yerlestir I=1

        }
        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}

        //Maplerde Ayni keyi kulllanirsan ustune yazar


















    }

}
