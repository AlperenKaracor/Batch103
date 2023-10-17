package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {
    //Bir String deki "m" karakteri haric tum karakterleri yazdiriniz
    //Andromeda ==> Androeda
//1. yol
      String str = "Andromeda";

      for(int i=0; i<str.length(); i++){

          char c = str.charAt(i);

          if(c!='m' && c!='M'){
              System.out.println(c);
          }



      }

//2.yol
        //continue calistigi zaman arttirma azaltma bolumune alir

        for(int i=0; i<str.length();i++){

            char c = str.charAt(i);

            if(c=='m'){
                continue;//bosver ==>   loop un icinde bazi degeerler icin loopun calismamasini isterseniz continue kullaniniz
            }
            System.out.println(c);



        }

//Example 2: 1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

        for( int i= 1; i<100;i++   ){

            if(i%6==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //Example 3 : Size verilen bir Stringdeki 'm' den onceki karakterleri yazdiriniz
        // luksemburg  ==> luxe

        String s = "Luxemburg";

        for(int i=0; i<s.length();  i++){
            char c = s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);
           // break; calisinca loop un disina atar



        }










    }
}
