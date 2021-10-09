package oops.instanceflow;

public class Test {


    {
        foo();
        //System.out.println(x);
        System.out.println("instance block 1");
    }

    public Test(){
        System.out.println("con");
    }

    public void foo(){

        System.out.println("foo"+x);
    }

    public static void main(String[] args) {
        new Test();
        System.out.println("main");

    }
    int x  = 10;
}
