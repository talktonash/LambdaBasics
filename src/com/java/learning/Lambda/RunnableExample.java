package com.java.learning.Lambda;

public class RunnableExample {

    public static void main(String[] args){

        Thread myThtread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }
        });

        myThtread.run();
        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda runnable"));
        myLambdaThread.run();
    }
}
