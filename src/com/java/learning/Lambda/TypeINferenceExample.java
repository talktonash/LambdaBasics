package com.java.learning.Lambda;

public class TypeINferenceExample {

    public static void main(String[] args){

        printLambda(s -> s.length());

        /*StringLengthLambda myLambda = a -> a.length();
        System.out.print(myLambda.getLength("Naresh"));*/
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }


    interface StringLengthLambda{
        int getLength(String s);
    }
}
