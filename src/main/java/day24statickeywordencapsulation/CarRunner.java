package day24statickeywordencapsulation;
//interview sorusu Static class a baglanmis class elemanlaridir
//Static class elemanlari butun objelerin ortak elemanidir
//Staticler uzerinde yapilan her degisiklik butun objeler etkilenir
//Static class elemanlarina class uzerinden ulasilir
//objeler static elemanlarina ulasmak icin kullanilmaz
//Staticler override edilemezler
/*
static keyword nedir?
static keyword class'a baglanmis class elemanlaridir
static class elemanlari butun Object'lerin ortak elamanidir.
static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
static Class elemanlarina Class uzerinden ulasilir.

 */
public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variable lara objeleri kullanrak ulasmak mumkun ama tavsiye edilmez
        //static variable lara class ismi kullanrak ulasilmalidir
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);











    }

}
