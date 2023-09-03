public class MyException extends Exception{
    String a;
    MyException(String a){
        this.a = a;
    }
    @Override
    public String toString(){
        return a;
    }
}