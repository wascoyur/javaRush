package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {

    public static List<Thread> threads = new ArrayList<Thread>(5);
    public static class Infinity extends Thread{

        @Override
        public void run() {
//            int CountInf = 0;
            while (true){
//               CountInf++;
//
//            System.out.println("... бесконечность # " + CountInf);
//                try {
//                    sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }

        }
    }
    public static class Except extends Thread{

        @Override
        public void run() {
            try {
                //d каких случаях выбрасывается Интеррупт Ексепшн?
                throw new InterruptedException();
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException");
            }

        }
    }
    public static class Ura extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Fourth extends Thread implements Message{

        @Override
        public void showWarning() {
            return;
        }

        @Override
        public void run() {
            if (currentThread().isAlive()) {
                interrupt();
            }
        }
    }
    public static class Numbers extends Thread{
        @Override
        public void run() {
            System.out.println("start Numbers");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int s = 0;
            String a;
            while (true){
                try {
                    a = reader.readLine();
                    if (!a.equals("N")){
                    s = s + Integer.parseInt(a);}
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(s);
                break;
            }
        }
    }
    static {
        threads.add(new Thread(new Infinity()));
        threads.add(new Thread(new Except()));
        threads.add(new Thread (new Ura()));
        threads.add(new Thread(new Fourth()));
        threads.add(new Thread(new Numbers()));
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < threads.size() ; i++) {
            threads.get(i).start();
        }
//todo: почему-то запускается только первый поток. level16.lesson10.task05;

        System.out.println("Жду...");
        Thread.sleep(10000);
    }

}
