package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {
        //Methodlar main methodun disinda olusturulur
        //Bir method Static se onun icindeki hersey static olmalidir
        //Static method olan "main method" un icindeki hersey static olmalidir
        /*
        1)Java variable'lerin orjinal degerlerini korumak ister
        2)Variable method'lar icinde kullanildiginda , Java method'un
        icine orjinal degeri koymaz o degerin kopyasini uretir
        ve method'a o kopyayi yollar.Method kopya ustunde degisiklik
        yapar dolayisiyla variable'in orjinal degeri korunmus olur
        Bu sistama "Pass by Value" denir
        Kisaca variable i degil degeri yolla amk diyor
        Note : Java "Pass By Value" denir
        Note : Bazi proglamlama dilleri orjinal degeri koruma altina
        almamistir.Bu isi developera birakmistir
        Bu tarz diller "Pass by reference" kullanir
         */

        int x = 5;
        System.out.println(x);//5
        chance(x);
        System.out.println(x);//5

        int ucret = 100;

        int kopya = indirim(ucret);
        System.out.println(kopya);//90

        System.out.println(ucret);//100








    }

    public static void chance(int a){
        System.out.println(a*3);

    }
    //void disindaki "return" type'larda method body'si icinde
    //"return" keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti - 10;

    }












}
