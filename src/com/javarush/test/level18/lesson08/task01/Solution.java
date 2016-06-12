package com.javarush.test.level18.lesson08.task01;

/* Wrapper (Decorator)
Разберись, что делает программа
Аналогично классу DecoratorRunnableImpl создай класс DecoratorMyRunnableImpl
*/

public class Solution {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("public static class RunnableImpl implements Runnable");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.print("public static class DecoratorRunnableImpl implements Runnable");
            component.run();
        }
    }
    public  static class DecoratorMyRunnableImpl implements Runnable{
        private Runnable component;

        public DecoratorMyRunnableImpl(Runnable companent) {
            this.component = companent;
        }


        @Override
        public void run() {
            System.out.println("static class DecoratorMyRunnableImpl implements Runnable");
            component.run();
        }
    }

}
