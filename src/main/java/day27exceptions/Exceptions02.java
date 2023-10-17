package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
    FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
    "new" den sonraki FileInputStream hata verir Cunku biz java ya verilen adresteki dosyaya git dedik
    Java iki endiseye kapildi
    i)Ya adres yanlissa
    ii)ya verilen adreste dosya yoksa
    Biz method isminden spnra throws FileNotFoundException yazarak
    javaya bu iki endise duydugun durum olusrusa Exception At dedik

     while((k = fis.read()) != -1) yazdigimizda read methodu hata verir Cunku biz javaya dosyadaki
     karaketerleri oku dedik Java bir endiseye kapildi
     i)Ya okumasi gereken karakterler  Javanin bilmedigi karakterlerse
     Biz method isminden sonra throws IOExceptions yazarak bu durumla karsilastiginda exception at dedik

     3) method isminden sonra throws IOExceptions yazarsani Java throws FileNotFoundExceptionu siler Cunku
     IOExcpetion FileNotFoundExceptionu  i kapsar IoException FileNotFoundException in parent idir onun yaptigi
     herseyi yapabilir o yuzden IOException varken FileNotFoundException a gerek yoktur

     IOException Inuput Output Exception demektir
     4)Gordugunuz gibi IOExcpetion ve FileNotFoundException biz kod yzarken daha Run butonuna basmadan ortaya cikti
      Bu tarz Excpetionlara Compile Time Excpetion denir diger adlari Checked Exception dir

      Compile Time exceptionlar Kesinlikle Halledilmelidir halletmeden code yazmaya devam etmeyin


     */

    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();

        readTheText();

    }

    //Bir text filedaki text i okuyan kodu yaziniz
    //1.Way
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
        int k = 0;
        while((k = fis.read()) != -1){//Baska character olmadiginda read methodu -1 verir
            System.out.print((char)k);
        }
    }
    //2.Way
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
            int k = 0;
            while((k = fis.read()) != -1){//Baska character olmadiginda read methodu -1 verir
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Daoyada okunamayan bir karakter var");
        }

    }











}
