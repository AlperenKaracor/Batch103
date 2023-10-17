package day24statickeywordencapsulation;
//Static = Moon (ayin uzerine cizgi cekersen herkes etkilenir)
//Non-Static = siyah gozlu(siyah gozlu insanin uzerine cizgi cekersen kimse etkilenmez)
//Kim nereye baglandiysa oradan ulas
public class Car {

    public static String make = "Honda";
    public String model = "Accord";
    public int price = 20000;
    public static int counter = 0;


    public Car(){
    counter++;
    price++;

    }





}
