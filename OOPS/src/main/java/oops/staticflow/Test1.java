package oops.staticflow;

public class Test1 {
    static int i = 10;

    static{
        foo();
        //System.out.println(j);
        System.out.println("First static");
    }

    public static void main(String[] args) {
        foo();
        System.out.println("Main");
    }

    public static void foo(){
        System.out.println(" food : "+j);
    }

    static{
        System.out.println("second static");
    }

    static int j = 20;

}
