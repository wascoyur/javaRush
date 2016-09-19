package com.javarush.test.level19.lesson03.task04;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner scanner;
        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }


        @Override
        public Person read() throws IOException {
            String[] lines = scanner.nextLine().split(" ");
            int yer = Integer.parseInt(lines[5]);
            int month = Integer.parseInt(lines[4]) - 1;
            int day = Integer.parseInt(lines[3]);
            Calendar birthDate = new GregorianCalendar(yer, month, day);
             String firstName = lines[1];
             String middleName = lines[2];
             String lastName = lines[0];
            Person person = new Person(firstName, middleName, lastName, birthDate.getTime());
            return person;
        }

        @Override
        public void close() throws IOException {
            this.close();
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\f1");
        Scanner scanner = new Scanner(file);
        PersonScanner adapter = new PersonScannerAdapter(scanner);
        adapter.read();
        System.out.println(adapter.read());
    }
}
