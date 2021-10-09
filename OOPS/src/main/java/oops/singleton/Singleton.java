package oops.singleton;

public class Singleton {
    String name;


    private Singleton(){
        name = "nagaraju";
        System.out.println("object created");
    }

    private static Singleton sngleton = new Singleton();

    public static Singleton getSingleton(){
            return sngleton;
      }


}



class Test{
    public static void main(String[] args) {
        Singleton s1 =  Singleton.getSingleton();
        System.out.println(s1.hashCode());
        Singleton s2 =  Singleton.getSingleton();
        System.out.println(s2.hashCode());
        Singleton s3 =  Singleton.getSingleton();
        System.out.println(s3.hashCode());
        Singleton s4 =  Singleton.getSingleton();
        System.out.println(s4.hashCode());
        Singleton s5 =  Singleton.getSingleton();
        System.out.println(s5.hashCode());
//        Singleton s6 = (Singleton)s5.clone();


    }
}
