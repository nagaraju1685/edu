package oops.typecasting;

public class TestClass {

    public static void main(String[] args) {

        String o = new String("abc");
        Object s = (Object)o;

        C c1  =  new C();
        c1.fooS();
        System.out.println(c1.name);

        B b1 =  new C();
        b1.foo();
        System.out.println(b1.name);

        A a1 =  new A();
        a1.foo();
        System.out.println(a1.name);

        A a = (B)a1;
        a.foo();
        System.out.println(a.name);


    }

}


class A {

    String name = "A";
    public void foo(){
        System.out.println("a foo.");
    }
    public static void fooS(){
        System.out.println("foo A");
    }

}
class B extends A{
    public void foo(){
        System.out.println("B foo.");
    }
    public static void fooS(){
        System.out.println("foo B");
    }
    String name = "B";
}

class C extends B{
    public void foo(){
        System.out.println("C foo.");
    }
    public static void fooS(){
        System.out.println("foo C");
    }
    String name = "C";
}
