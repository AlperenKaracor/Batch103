package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        password un ılk harfı buyuk harf ıse
         'A' olursa gecerlı password aksi halde gecersız password
         Password un ılk harfı kucuk harf ıse
         'z' olursa gecerlı password aksı halde gecersız password
         */
        String pwd = "Axy12!";
        char ilkHarf = pwd.charAt(0);
        if (ilkHarf >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password");
            }

        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0)<='z') {

        if(pwd.charAt(0)=='z'){
            System.out.println("Gecerli pass");
        }else{
            System.out.println("gecersız");
        }


    }else{
            System.out.println("Ilk karakter harf olmalıdır");
        }


}
}
/*
public class NestedIf01 {

    public static void main(String[] args) {

        /*
            Password'un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
            Password'un ilk harfi kucuk harf ise
                'z' olursa gecerli password aksi halde gecersiz password


    String pwd = "5xy12!";

    char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){


                if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
                }else{
                System.out.println("Gecersiz Password");
                }


                }else if(ilkHarf>='a' && ilkHarf<='z'){


                if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
                }else{
                System.out.println("Gecersiz Password");
                }


                }else{

                System.out.println("Ilk karakter harf olmalidir");

                }

                }
                }
 */