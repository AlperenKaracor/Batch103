package day22inheritancepolymorphism;

public class CatRunner {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        //Constructarlar yukaridan asagiya dogru yaratilir
        //Constructarlar yukaridan asagiya dogru calisir
        //super(); parenttaki contructiri bul
        // cons ilk satirinda super(); keyword u vardir
        //object class a kadar tirmanacak sonra asagi inerken cons lari calistiracak
        //javay cat cons u kullan dedigim zaman super keyword u ile yukari timanir ve asagi inerken cons lari calistirir
        //super bizim child class dan parent class a gidip ordaki cons u kullanmamizi saglar
        //super(); paretn cons u cagirmak icin kulllanir
        //// Note :  Object olusturken Java Constructer kontrol eder ve onlari calistirir.
        //// Note : Her Constructer ilk satirinda gorunmeyen super(); ==>kodu vardir.
        //// super(); ==> Parent'taki Constructer'i cagirmak icin kullanilir.
        // Java ya göre bir Child Class'in olusturulmus olmasi icin bir Parent Class olmasi lazim
        /*
        1)Java da object olustururken cons lar parentdan child a dogru calistirilir
        2)Java en ust parent cons a cikabilmek icin super(); kodunu kullanir
        3)super() kodu her cons in ilk satirinda gizli olarak bulunur
        4)super kodunu isterseniz gorunur sekildede yazabilirsiniz Java kizmaz
        5)super kodunu gorunur sekilde yzarsaniz sakin ha ilk satir disinda bir satir disina koymayiniz hata verir
        6)super kodu parent class dan cons cagirmaya yarar
         */




    }
}
