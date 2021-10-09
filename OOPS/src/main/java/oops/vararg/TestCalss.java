package oops.vararg;

public class TestCalss {

    public void printVaragrs(int... x){

        for (int i =0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }


    public static void main(String[] args) {
        new TestCalss().printVaragrs(10,2,4);
    }

}
