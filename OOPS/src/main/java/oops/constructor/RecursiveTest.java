package oops.constructor;

public class RecursiveTest {

     RecursiveTest(){
         this(10) ;

    }

     RecursiveTest(int x){
        new RecursiveTest();
    }
    public void abc(int x ){
        System.out.println("thsi will call :"+x);
    }

    public static void main(String[] args) {
      new RecursiveTest();
    }

}
