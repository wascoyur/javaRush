package com.javarush.test.level19.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека
находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner scanner;
        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("d:\\f1"));
            String s = br.readLine();
            String firstName = scanner.next(s);
            String middleName = scanner.next(s);
            String lastName = scanner.next(s);
            Date birthDate = new Date(scanner.next(s));

            return new Person(firstName,middleName,lastName,birthDate);
        }

        @Override
        public void close() throws IOException {

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

    }
}
