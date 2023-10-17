package day23_inheritancepolymorphism;

public class Math extends Courses{

    //ayni class in icinde bir cons kullandiktan sonra baskasinida kullanmak istersen this() kullan
    //Ayni class in icinde diger cons u kullan
    //this demek bu classin ici demek
    //parantezi bos olani secmek istiyorsan icine hicbirsey yazma


    public void practice(){
        System.out.println("solve questions");

    }
    public Math(){
        super("V");//super i bos birakirsan parametresiz olani kullanir
        System.out.println("Constructor 1");
    }
    public Math(int a){
        this();//bu classdaki parametsesiz cons u kullan
        System.out.println("Constructor 2");
//ayni class daki parametreyi kullanacaksan this() kullan bu class daki cons a git hangisine parametresi olmayana
        //kullanmayi dudundugun cons parentdaysa super() kullan

    }

}
