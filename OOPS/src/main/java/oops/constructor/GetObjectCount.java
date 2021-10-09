package oops.constructor;

public class GetObjectCount {
    static int x = 0;
    int id;
    String name;
    {
        x++;
        System.out.println("ib");
    }

    public  GetObjectCount(int id, String name){
        System.out.println("CB");
        this.id =id;
        this.name = name;
    }


    public static void main(String[] args) {
        System.out.println(x);
        GetObjectCount g1 = new GetObjectCount(1,"A");
        System.out.println(x);
        GetObjectCount g2 = new GetObjectCount(1,"A");
        System.out.println(x);
    }
}
