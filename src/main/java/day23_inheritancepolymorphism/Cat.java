package day23_inheritancepolymorphism;

public class Cat extends Mammal{



    public void meow(){
        System.out.println("Cats meow");
    }
    @Override //@Override annotatio ini kullanarak Java'nin yaptigimiz Override islemini kontrol etmesini saglariz
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //asagidaki method overriding method
    @Override
    public Mammal create() {
        return new Mammal();

    }





/*
    1)Override yapaken method uhn body si degistirilir
    2)Override yparken asla method signature (isim ve parametre) degistirilemez
    3)Override yaparken inheritance olmak zorundadir
    4)Override yaparken access modifiers belli kurallara gore farklilastirilabilirler
        i)"private" methodlar override edilemezler
        ii)Child icindeki override edilen method un acces modifier i parent class daki
           method 'un access modifier i ile ayni veya genis olmali
           Note : Child class daki methodun access modifier i daha dar olamaz
           iii)defualt methodlar ayni package icinde ise override edilebilirler
           farkili package den override edilemezler
           override yapabilmek icin inheritance olmali
           5)Parent class daki method un return type i void ise return type degistirilemez
           6)parent class daki method un return type i primitive ise return type degistirilemez
           7)parent class daki method un return type i Wrapper calss  ise return type degistirilemez
           8)parent class daki method un return type i Parent calss  ise return type child lardan biri olabilir(!!!!!)
           9)final methodlar override edilmezler cunku overriding de method body degistirilir fakat
           final method body degistirilmesine musaade etmez
           10)final methodlar Override edilemezler cunku overriding de method body degistirilir fakat
           final method body degistirilmesine musaade etmez
           11)polymorphism(cok bicimlilik) = Overloading + Overriding
           Note: Polymorphism nedir derlerse overloading ve overriding i anlatin
           12)Overloading ve Overriding arasindaki farklar nelerdir?
               i)Overloading(bir tane class in icinde olur parent yok child yok) icin inheritance gerekmez fakat overiding(parentdan alip degistiririz) icin gerekir
               ii)Private methodlar overload edilebilir , override edilemezler
               iii)"final" methodlar overload edilebilir , override edilemezler
               iv)Overloding static polymorphism olarak , overriding dynamic polymorhism olarak adlandirilir
               Cunku static methodlar overload edilebilir
               v)Overloading  de method signature degisir ama overriding de method signature dokunulmaz










           Note: Child class daki return type parent classdakinden genis olamaz
           overriding de inheritance sart
           Note:Aralarinda parent child iliskisi olmayan classlar overriding de return type degisiminde kullanilamazlar
           mesela short Integer de kucuktur fakat aralarinda paretn child iliskisi olmadigindan Ineger yerine short
           kullananmazsiniz
           "is a" cocuktan parent a gidiyoruz
           "has a" parenttan cocuga giderken
           "is a" yoksa return type i degistiremezsin
           Note: Child daki method un return type indan Parent taki method un return typeina gidiste
          " Is a" relationship olmali,aralarinda is a relationship olan data type lara covariant denir
          Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.(Goksel Bey:))



     */


}
