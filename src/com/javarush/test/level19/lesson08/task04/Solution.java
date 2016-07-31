package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream fake = new PrintStream(byteArrayOutputStream);
        System.setOut(fake);
        testString.printSomething();
        System.setOut(printStream);
        String sb = new String(byteArrayOutputStream.toString());
        String[] str = sb.split(" ");
        if (str[1].equals("*")){
            System.out.println(str[0] + " * " + str[2] + " = " +(Integer.parseInt(str[0])*Integer.parseInt(str[2])));
        }
        else
        if ((str[1].equals("+") )){
            System.out.println(str[0] + " + " + str[2] + " = " +(Integer.parseInt(str[0])+Integer.parseInt(str[2])));
        }
        else
            if ((str[1].equals("-") )){
                System.out.println(str[0] + " - " + str[2] + " = " +(Integer.parseInt(str[0])-Integer.parseInt(str[2])));
            }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

