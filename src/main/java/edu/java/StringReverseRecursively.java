package edu.java;

public class StringReverseRecursively {

    public static void main(String[] args) {
        String input = "abc";

        System.out.println(input.substring(1));
        String reverse = StringReverseRecursively.reverse(input);
        System.out.println(reverse);

    }

    public static String reverse(String input){
        if(input.length() == 1){
            return input;
        }
        return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));
    }
}
