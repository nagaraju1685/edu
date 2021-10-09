package oops.overriding;

public class Test {
    public static void main(String[] args) {
        Parent p  = new Child();
        p.foo(10);
        System.out.println(p.x);
    }

}
