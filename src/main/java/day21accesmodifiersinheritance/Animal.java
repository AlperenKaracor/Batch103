package day21accesmodifiersinheritance;

public class Animal {
      //Javada her class in ortak babasi olan bir class var object class denir buna babalarin babasi class
      /*
      1)Inheritance sayesinde
      i)Code tekrarlarindan kurtuluruz
      ii)Code tamini(maintenance) kolay olur
      iii)Child Class'lari daha atomic yapmis oluruz

      2)Bir Class'i baska bir class'in Child Class'i yapmak icin
      "extends" keyword kullanilir.ilk yazilan calss Child 2. yazilan Class parent olur


      3)Child Class object'leri parent Class'dan method ve varible'lari kullanabilirler.

      4)Parent Class object'leri Child Class'dan method ve variable'lari kullanamazlar

      5)Object Class her class'in parent'idir
      Java da Object Class haric her Class'in parent'i vardir
      Java'da parent'i olmayan tek Class Object Class dir
      6)Private method ve variable ler Child class lar tarafindan kullanilamaz inheritance edilemez
       protected method ve variable lar ayni package deki child class lar tarafindan kullanilabilir
       default method ve variable lar child class lar tarafindan kullanilabilir
       public method ve variable lar child class lar tarafindan kullanilabilir
       Note:Child class lar tarafindan kullanilabilir olmak inherit edilebilir demektir

       7)4 tip inheritance vardir
       i)Multilevel inheritance:Java bunu kabul eder
       ii)Hierarchical Inheritance Bir parent icin coklu child Java bunu kabul eder
       iii)Multiple inheritence bir Child'a coklu parent java bunu desteklemez
       iv)Single inheritance bir child class icin bir parent class demektir Java bunu destekler

     */
    public void eat() {
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink...");
    }


}
