package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        //Example 1: Java'dan aldiginiz date'i ay/gun/yil olarak yaziniz

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//2 MM == Int 10'dan kucuk aylari 01 02 03 vs seklinde yazar
        String formattedDate = dtf1.format(currentDate);
        System.out.println(formattedDate);//10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");//3 MM == Ayin ilk 3 harfi
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);//Eki/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");//4 MM == Ayin full ismi
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);//Ekim/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");//1 M == 10'dan kucuk aylari 1,2,3 vs seklinde yazar
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);//10/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");//2 yy == Yilin son 2 rakamini yazar
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5);//10/21/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");//tek d 10'dan kucuk gunleri 1,2,3 vs seklinde yazar 01,02,03 kulannmaz
        String formattedDate6 = dtf6.format(currentDate);
        System.out.println(formattedDate6);

        //Example 2 : Java dan aldiginiz time;in formatini degistiriniz

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);//16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini "hh" 12 saat sistemini kullanir
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);//16:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23 PM


































    }
}
