package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {


        int i = 1;    // once dusun sonra hareket et

        while (i < 1) {
            System.out.println("While loop");
            i++;
        }
        //While loop bazi durumlarda hic calismayabilir yani shileloop icin zero execution mumkundur
        //do while loop da zero execution mumkun degil do while loop kullandigimizda
        // loop body si icndeki code en az bir kere calisir
//while loop icin loop body si icindeki kodun hic calistirilmama ihtimali vardir
        int k = 1;

        do {
            System.out.println("do while loop"); // haraket et sonra dusun
            k++;

        } while (k < 1);
//do while loop un body si icindeki kod her halikarda en az bir kere calisir

        //do while mesela atm makinalarinda kullanilir once sifre al sonra para ver vay amk

        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz
        //      24,5673  ==>  5+6+7+3 = 23

        double num = 24.5673;
        System.out.println(num);


        //String.valueOf(num) methodu parantezin icine konulan data nin tipini String yapar
        String str = String.valueOf(num);
        System.out.println(str);

//Regex icin nokta kullandiginizda onune \\ koyunuz Yani nokta \\. seklinde kullanilir
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);
int sum = 0;
do{
    sum = sum + decimalInt%10;

    decimalInt = decimalInt/10;

} while(decimalInt>0);
        System.out.println(sum);

}
    }