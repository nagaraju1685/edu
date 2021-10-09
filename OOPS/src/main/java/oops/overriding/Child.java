package oops.overriding;

public class Child extends Parent{
    static int y = 20;
    public final String foo(Object x){
        System.out.println("chiold foo");
        return "";
    }
}
