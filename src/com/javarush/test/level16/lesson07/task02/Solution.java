package com.javarush.test.level16.lesson07.task02;

/* Stopwatch (Секундомер)
1. Разберись, что делает программа.
2. Реализуй логику метода doSeveralSteps так, чтобы учитывалась скорость бегуна.
2.1. Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
2.2. Метод sleep в классе Thread принимает параметр типа long.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Ivanov", 4);
        Runner petrov = new Runner("Petrov", 2);
        //на старт!
        //внимание!
        //марш!
        ivanov.start();
        petrov.start();
        Thread.sleep(2000); // пауза
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) { // создаем секундомер
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) { // пока в майн не сработал изСтоппед выполняем доСеверал
                    doSeveralSteps();
                }
            } catch (InterruptedException e) {
            }
        }

        private void doSeveralSteps() throws InterruptedException {
            stepNumber++; // делаем шаг
            //add your code here - добавь код тут
            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!"); //
            System.out.println(owner.getName() + "speed = " + owner.getSpeed() + " Stopwach # " + Stopwatch.this);
        }
    }

    public static class Runner {
        private String name;
        private double speed;
        Stopwatch stopwatch;

        public Runner(String name, double speed) { //создаем Руннер Иванов/Петров
            this.name = name; // устанавливаем имя бегуна
            this.speed = speed;// устанавливаем скорость бегуна
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public double getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start(); // запуск секундомера
        }
    }
}
