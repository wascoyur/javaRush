package com.javarush.test.level25.lesson11.task02;

/* Первый закон Финэйгла: если эксперимент удался, что-то здесь не так...
Обеспечьте переуступку кванта времени (переход хода для текущей нити)
 для последовательных выводов текста в консоль
*/
public class Solution extends Thread{
    public static class YieldRunnable implements Runnable {
        private int index;

        public YieldRunnable(int index) {
            this.index = index;
        }

        public void run() {
            System.out.println("begin-" + index);
            System.out.println("end-" + index);
        }
    }

    public static void main(String[] args) {
        YieldRunnable tmp = new YieldRunnable(1);
        Thread trd = new Thread(tmp);
        trd.run();

    }
}
