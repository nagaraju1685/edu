package oops.interfce;

public interface Inter1 {
    public  void print();

    static void print1(){
        System.out.println("test");
    }

}

class Base{
    public static void newMethod(){
        System.out.println("static");
    }
}


class Demo implements Inter1{
    public static void main(String[] args) {
      Demo d =  new Demo();
      d.print();
      Inter1 i =  new Demo();
      i.print();
      Base b = new Base();
      b.newMethod();
    }

    @Override
    public void print() {
        System.out.println("print");
    }
}