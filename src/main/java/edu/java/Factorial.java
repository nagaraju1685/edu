package edu.java;

public class Factorial {

    public static void main(String[] args) {
     int fact = new Factorial().factorial(4);
        System.out.println(fact);
    }

    public int factorial(int f){
        if(f==0){
            return 1;
        }
        return f * factorial(f-1);
    }
}
