package day24statickeywordencapsulation;

//Encapsulation "Data Hiding(Gizlemek)" demektir
//Data yi nicin gizlersiniz? datayi dis etkenlerden korumak icin deriz
//Data yi nasil gizlersin? Access modifier ini private yaparak gizlerim
//Data  yi gizledikten sonra baska classlardan okumak istersen ne yaparsin?
//"get" method lar(getter) olusturarak gizledigiz datalari okunur hale getirebiliriz
//Datayi gizledikten sonra baska classlardan degistirmek istersen ne yaparsin
//"set methodlar(setter)" olusturarak gizledigimiz datalari degistirebilirz
//Her data gizlenmez
//Variable Data type i ile get methodun return type i ayni olmalidir
//get methodlari isimlendirilirken "get + variable name" ancak variable in data type i boolean ise "is + variable name "
public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean isRetired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return isRetired;
    }
//Set methodlar
    //set method sana yeni birsey getirmez sadece degistirir o yuzden return type i void dir
    //set method parametre ile calisir
    //parametre variable data type inda olur
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }


}
