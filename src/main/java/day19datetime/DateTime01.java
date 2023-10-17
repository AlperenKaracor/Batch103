package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: Anlik tarihi (current date) ekrana yazdiran kodu yaziniz

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);//2022-10-21

        //Example 2 : Anlik zamani (Current time) ekrana yazdiran kodu yaziniz

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:41:37.910252400

        //Example 3 : Anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:13.505643800

        //Example 4 : Japonya da anlik tarihi ve zamani ekrana yazdiran kodu yaziniz

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:24.884115100

        //Example 5 : Istanbuldaki Anlik tarih ve saat i ekrana yazdir

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:52:06.490491700

        //Example 6 : Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz

       LocalDate countDate =  LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println("emekli olma tarhihin : " + retireDate);//2024-12-18

        //Example 7 : iki cocugunuzun dogun tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);


        //between() methodu kullanildiginda daha eski olan tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);//2824

        //Example 8 : istanbul un Fethi ile cumhuruiyetin kurulmasi arasinda kac ay oludugunu gosteren kodu yaziniz
        //  29 mayis 1453 istanbul fetih          29 ekim 1923 cumhuruiyet kurulusu

        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuruiyeKurulus = LocalDate.of(1923,10,29);
        Long diff1 = ChronoUnit.MONTHS.between(istanbulunFethi,cumhuruiyeKurulus);

        System.out.println(diff1);

        //Example 9 : Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989,3,22);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        System.out.println(day + "   " + month);
       // int month = myDate.getMonth();//Ayin ismini verir
        //1.yol

        if(day>21 && month==3) {
            System.out.println("koc burcusun");

        }else if(day<=20 && month==4){
            System.out.println("koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }

        //2.yol
        if((day>=21 && month==3) || (day<=20 && month==4)) {
            System.out.println("koc burcusun");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("boga");
        }














    }
}
