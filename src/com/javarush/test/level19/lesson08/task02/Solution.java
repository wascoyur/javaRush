package com.javarush.test.level19.lesson08.task02;

/* Ридер обертка 2
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна заменять все подстроки "te" на "??"
Вызовите готовый метод myPrintSom(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream standart = System.out;
        ByteArrayOutputStream mass = new ByteArrayOutputStream();
        PrintStream potok = new PrintStream(mass);
        System.setOut(potok);
        testString.printSomething();
        String buffer = mass.toString();

        System.setOut(standart);
        buffer = buffer.replace("te", "??");
        System.out.println(buffer);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
    }
    }
}
