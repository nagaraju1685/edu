package oops.overloading;

public class Test {

//    public void foo(String string){
//        System.out.println("(string)");
//    }
    public void foo(StringBuffer sb){
       System.out.println("(int)");
    }

    public void foo(int x,float b){
        System.out.println("if");
    }

    public void foo(String name, int... x){
        System.out.println("....");
    }

    public void foo(float b,int a){
        System.out.println("fi");
    }

//    public void foo(int int1){
//        System.out.println("(int)");
//    }

    public void foo(Integer  interger){
        System.out.println("Inter");
    }

    public void foo(Object  O){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Integer i =  null;
        t.foo("Nagaraju");
//        t.foo("Nagaraju");
//        t.foo('a');
//        t.foo(null);
//        t.foo(new Object());
//        t.foo("");
        //  t.foo(10.5,10.5);


    }

    public int add(int x,int y){
        return x+y;
    }

     public String add(Object x,Object y){
        return "";
    }

}
