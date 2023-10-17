package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {
        //Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.
        //Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
        //O Class'da bulamazsa Parent Class'lara.
        //Hicbir Class'da bulamazsa hata verir
        //Her class data type dir ama her data type class degildir

        Cat cat1 = new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);



        Mammal cat2 = new Cat();
        System.out.println(cat2.a);//13

        Animal cat3 = new Cat();
        System.out.println(cat3.a);//12

        //Object olustururken Object'in data type'i Child Class'lardan secilemez

        //Inheritance'da variable'lar secilirken Java Constructar'a bakar.
        //Oncelikle istediginiz method'u Constructori kullanilan Class'dan alir
        //O Class'da bulamazsa Parent Class'lara bakar
        //Hicbir yerde o method'u bulamazsa hata verir
        //Methodlarda return type vardir constructerlarda return type yoktur
        //constructarlarin ismi class ile ayni olmak zorundadir method isimleri sana bagli
        //method isimleri kucuk arfle baslar constructer isimleri buyuk harfle baslar
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();


        Mammal cat5 = new Mammal();
        cat5.eat();//Mammal eat

        Animal cat6 = new Animal();
        cat6.eat();//Animal eat

    }
}
