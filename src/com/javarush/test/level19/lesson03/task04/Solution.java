package com.javarush.test.level19.lesson03.task04;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
Метод read() должен читать данные одного человека.
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner scanner;
        public PersonScannerAdapter(Scanner scanner){
            this.scanner = scanner;
        }




        @Override
        public String read() throws IOException {
            return scanner.next();
        }

        @Override
        public void close() throws IOException {
        scanner.close();
        }
    }
}
