package oops.inheritance;

public class Test {

    public static void main(String[] args) {
        Base b = new Base();
        b.baseFoo();
        Derived  d = new Derived();
        d.derivedFoo();
        d.baseFoo();
        Base b1 = new Derived();
        b1.baseFoo();
        //Derived d1 =  new Base();

    }

    public void foo1() {
        System.out.println("foo");
    }
    public void foo2() {
        System.out.println("foo");
    }
}
