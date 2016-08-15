package com.javarush.test.level25.lesson05.home01;

/**
 * Created by vasiliev on 14.08.2016.
 */
public class LoggingStateThread extends Thread{
    public LoggingStateThread(Thread thread) {

    }

    @Override
    public void run() {

        while (!currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getState());

        }

    }
}
