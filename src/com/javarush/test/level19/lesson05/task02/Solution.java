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
        BufferedReader gfn = new BufferedReader(new InputStreamReader(System.in));
        String fName = gfn.readLine();
        FileInputStream fis = new FileInputStream(fName);
        FileReader fr = new FileReader(fName);
        char[] ch = new char[fis.available()];
        fr.read(ch);
        int word = 0;
        String preStr = (String.valueOf(ch)).replaceAll("\\p{Punct},\\b"," ");
        String[] str = preStr.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("world"))word++;
        }
        System.out.println(word);
        gfn.close();fis.close();fr.close();
    }
}
