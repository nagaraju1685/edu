package exception;

public class Test {
    public static void main(String[] args) {
       A a = new B();
       try {
           System.out.println("test");
          // System.exit(0);
           a.foo();
       }catch (Exception e) {
           System.out.println("IOException"+e.getMessage());
       }finally{
           System.out.println("finally");
       }
        System.out.println("end");

    }
}

class A{
    public void foo()throws Exception {System.out.println(" its A"); }
}

class B extends A{
    public void foo()throws MyException {
        System.out.println("its B");
        throw new MyException("its My Exception");
    }
}

class MyException extends Exception{

    public MyException(String message){
       super(message);
    }

}