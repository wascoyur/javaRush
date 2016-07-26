package com.javarush.test.level25.tmp;

public class App {

    public static void main(String[] args) {
        System.out.println("Родительский поток.");
        for(int i = 1; i <= 10; i++){
            Thread t = new Thread(new AppThread());
            t.start();
            Thread.yield();
        }
    }

}
