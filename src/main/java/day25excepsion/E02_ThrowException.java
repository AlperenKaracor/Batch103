package day25excepsion;

public class E02_ThrowException {

    public static void main(String[] args) {
        String arr [] = {"Rip","and","Tear","Madafaka"};

        getElementFromArray(arr,2);//Tear
        getElementFromArray(arr,0);//Rip
        getElementFromArray(arr,4);


    }
    //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun
    public static void getElementFromArray(String arr[], int idx){


        try{
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Array index te bir problem meydana geldi  => " + e.getMessage());
            //Exception ile ilgili detaylica teknik mesaj verir
            e.printStackTrace();

        }

    }



}
