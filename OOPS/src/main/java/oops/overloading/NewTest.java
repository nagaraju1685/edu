package oops.overloading;

public class NewTest {
    public void foo(Animal a)throws NullPointerException {
        System.out.println("animal");
    }
    public void foo(Monkkey m)throws NumberFormatException{
        System.out.println("moneky");
    }

    public static void main(String[] args) throws Exception{
        NewTest t  = new NewTest();
        Animal a = new Animal();
        Animal a1 = new Monkkey();
        Monkkey m = new Monkkey();
        t.foo(a);
        t.foo(m);
        t.foo(a1);

    }

}
