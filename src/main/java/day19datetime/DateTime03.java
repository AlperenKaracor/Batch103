package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak  hesaplayan kodu yaziniz

        LocalDateTime japanCurrentTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germanyCurrentTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long diff = ChronoUnit.HOURS.between(germanyCurrentTime,japanCurrentTime);

        System.out.println(diff);//6

        //Example 2 : Sabit bir tarih olusturunuz

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);

        System.out.println(myDate);//2011-04-13

        /*
        1)Java'da sabit datalari(Gun isimler,Ay isimleri,Amerika'daki eyalet isimleri etc.)
        depolamak ve gerektiginde kullanmak icin depolar olustururuz
        Bu depolara "Enum" denir.Bunlarin icine degisecek bilgiler konulmaz
         */

        //Example 3 : USA icin "Woow" UK icin "Big" CANADA icin "Cold" "TURKEY" icin "VATAN" GERMANY icin "Araba" RWANDA icin "Cay"
        Countries country = Countries.FRANCE;

        switch (country){

            case TURKEY:
                System.out.println("Vatan");
                break;
            case USA:
                System.out.println("Voow");
                break;
            case CANADA:
                System.out.println("cold");
                break;
            case FRANCE:
                System.out.println("beyaz bayrak");
                break;
            case RWANDA:
                System.out.println("afrika");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }








    }
}
