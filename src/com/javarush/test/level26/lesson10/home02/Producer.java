package com.javarush.test.level26.lesson10.home02;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by vasiliev on 13.09.2016.
 */
public class Producer implements Runnable{
    protected ConcurrentHashMap<String, String> map;
    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        int i = 1;
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Some text for " + i);
                i++;
            } catch (InterruptedException e) {
                System.out.println("[" + currentThread.getName()+"]"+ " thread was terminated");
            }


        }
    }
}
