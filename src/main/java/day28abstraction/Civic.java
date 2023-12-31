package day28abstraction;

public class Civic implements Engine, AC, Hood {//Bir class i bir interface in child i yapmak icin implements kullaniriz


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("tsi ne amk");
    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital");
    }

    @Override
    public void climate() {
        System.out.println("uses climate");
    }
}


//    ABSTRACT vs INTERFACE
//        1) Abstract :
//        1.1 - Class`dir.
//        1.2 - Abstract ve concrete method`lar konabilir.
//        1.3 - Kismi olarak abstraction saglar.
//        1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
//        1.5 - Hiz acisindan avantajlidir
//        1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
//        1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
//        1.8 - Abstract class constructor`a sahiptir
//
//        2) Interface :
//        2.1 - Class degildir.
//        2.2 - Sadece abstract method`lar konabilir.
//        2.3 - Tam abstraction (soyutluk) saglar
//        2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
//        2.5 - Hiz acisindan abstract class`a gore yavastir.
//        2.6 - Icindeki tum nesnelerin public olmasi gerekir.
//        2.7 - Method'lar static olamaz
//        2.8 - Abstract class constructor`a sahiptir    */