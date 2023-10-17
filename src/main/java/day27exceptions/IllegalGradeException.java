package day27exceptions;
//Eger Exception class a extend ederseniz sizin classiniz Compile Time Exception olur
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }
}
