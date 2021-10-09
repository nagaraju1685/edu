package exception;

public class ttt{

    public static void main(String[] args)throws Exception {
        throw new Exception();
    }
    public static void badMethod() {
        throw new RuntimeException();
    }
}