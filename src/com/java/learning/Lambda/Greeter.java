package com.java.learning.Lambda;

public class Greeter {
    public static void main(String[] args){
        Greeter greeter = new Greeter();

        Greeting hello = new HelloWorldGreeting();
        Greeting myLambdaFunction = ()-> System.out.print("Hello World");
    }


    public void greet(Greeting greeting){
        greeting.perform();
    }
}

