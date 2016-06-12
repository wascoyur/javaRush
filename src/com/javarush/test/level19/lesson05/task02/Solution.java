package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String seaWord = "world";
        int count = 0;
        String fName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fis = new FileInputStream(new File(fName));
        byte[] syrec = new byte[fis.available()];
        fis.read(syrec); fis.close();
        String[] slova = new String(syrec, "cp1251").split("\n");
        String[] ready = new String[0] ;

        for (String line : slova) {
            ready = line.split(" ");
        }
        for (String x : ready) {
            if (x.equals(seaWord)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
