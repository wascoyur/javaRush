package com.javarush.test.level25.lesson07.home01;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    @Override
    public void run() {
        Thread thread = new Thread();
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void start(String threadName) {
        run();
    }

    @Override
    public void stop() {

    }
}
