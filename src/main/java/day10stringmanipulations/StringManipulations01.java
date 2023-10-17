package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        boolean b = a.startsWith("va",2);

        System.out.println(b);
        //startsWith("kola" , 5) kodu ilk 5 karakterden sonraki String e bakar ve o String in kola ile baslayip baslamadigini kontrol eder
        //"kola" ile basliyorsa "true" baslamiyorsa "false" return eder

        String c = a.replace("a" , "*");
        System.out.println(c);

//replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
//replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
      String d = a.concat("anladin mi");
        System.out.println(d);

//concat() method'u iki tane String;i birbirine yapistirmaya yarar.
        //Java konuyla alakali bir method olusturmussa onu kullan amk
        //hayvan gibi yedim ben ne dengesiz adamim amk


        String e = "      Tom Hanks       ";
        System.out.println(e);
        //trim() methodu bir stringin bas ve sonundaki space karakterlerini siler aradaki space karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);

        String h = "Java";
        String i = "Kava";

        int k = h.compareTo(i);

        System.out.println(k);
        //h.compareTo(i); kod iki tane String i alfabetik(lexicographic )olarak karsilastirir
        //buyuk harf e duyarlidir
        //buyuk harf kucuk harf e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz
        //h.compareTo(i); kodda h nin alfabetik sirasinin i nin alfabetik sirasi cikarilir

        String n = a.repeat(55);
        System.out.println(n);









    }
}
