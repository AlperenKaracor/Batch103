package day21accesmodifiersinheritance;

public class StudentRunner {
    //Icinde aminmethod olan classlara runner denir
//Birsey private ise ona sadece icinde bulundugu class dan ulasabilirsin
    //private i sadece icinde bulundugu class da kullanabilirsiniz
    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    //baska class da kullanamazsin mumkun degil
    //Public her classda kullanilabilir
    //Default olanlar baska package den kullanilamaz
    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.stdName);





    }

}
