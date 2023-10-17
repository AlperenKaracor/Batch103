package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
//OFFER VERDIRTEN ONEMLI SORU
    public static void main(String[] args) {

        //Size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz
        //abbcaa ==> a=3 b=2 c=1
        //Key value yapisi varsa aklina maps gelsin

        String kelime = "abbcaa";
        HashMap<String,Integer> gorunum = new HashMap<>();//Ben bu kodu yazinca bor bir map im olacak {       }

        String[] harfler = kelime.split("");//Kelimedeki harfleri alabilmek icin "" koyduk//[a, b, b, c, a, a]
        System.out.println(Arrays.toString(harfler));//[a, b, b, c, a, a]

        for(String w : harfler){
            Integer gorunumSayisi = gorunum.get(w);

            if(gorunumSayisi==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayisi+1);//int null icermez
            }
        }





















    }
}
