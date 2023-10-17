package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

  /*
  "throw"  ile "throws" arasindaki farklar nelerdir
   1)"throw" methodun body si icinde kullanilir "throws" ise methodun isminden sonra kullanilir-
   2)"throw" dan sonra object olusturulur "throws" dan sonra ise sadece Exception Class in ismi yazilir
   3)"throw" methodun icinde istedigimiz yerde exception uretmek icin kullanilir. "throws" ise var olan
   checked Exceptioni atmak icin kullanilir
   4)"throw" dan sonra sadece bir tane Exception olabilir
   "throws" dan sonra 1 den fazla exception olablir

   */

public class ReadFileLineByLine {
    public static void main(String[] args) {
      readFileLineByLine();


    }


    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));

            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
               line =  br.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis  " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var  " + e.getMessage());
        }


    }

}
