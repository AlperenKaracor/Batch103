package day02methodcreation;

public class MethodCreation {
    //maın methodun ıcınde kullanacagınız her sey statıc olmalıdır
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));
        üçSayıyıBiribiriİleÇarp(55, 55,33);
        System.out.println( üçSayıyıBiribiriİleÇarp(5, 5,2));
        System.out.println(ucSayıdanIlkIkisiniToplaUcuncuSayıIleCarp(3 ,4 ,5 ));

    }

        public static double toplamaYap(double a, double b){ //====METHOD

            return a+b;

        }
        public static double üçSayıyıBiribiriİleÇarp(double a, double b, double c){

        return a*b*c;
        }
        public static double ucSayıdanIlkIkisiniToplaUcuncuSayıIleCarp(double n, double m, double v){

        return(n+m)*v;
        }




}
