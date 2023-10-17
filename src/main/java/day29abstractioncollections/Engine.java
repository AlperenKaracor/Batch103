package day29abstractioncollections;

public interface Engine extends Vehicle{
    //Child        Parent
    //Class ----> Interface ==> implement
    //Class -----> Class ==> extensds
    //Interface ---> Interface ==> extends
    //Interface ---> Class ==> Mumkun degil (bir class bir intefacenin parenti olamaz)

    void run();
    //interface lerdeki tum variable lar otomatik olarak(defualt) public dir
    //interfacelerdeki tum variable lar otomatik olarak(defualt) final dir
    //interfacelerdeki tum variable lar otomatik olarak(defualt) static dir
    //static olan birsseye interfacenin ismiyle ulasabilirisniz
    public static final int price = 2000;

    double weight = 23.5;



}
