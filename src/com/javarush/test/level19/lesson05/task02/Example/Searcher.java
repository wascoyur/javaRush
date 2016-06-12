package com.javarush.test.level19.lesson05.task02.Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by yur on 08.06.2016.
 */
public class Searcher {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String searchWord = "world"; // слово заменить на нужное
        FileInputStream fis = new FileInputStream(new File("d:\\f1")); // путь заменить на нужный
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();
        String[] lines = new String(content, "Cp1251").split("\n"); // кодировку указать нужную
        int i = 1;
        for (String line : lines) {
            String[] words = line.split(" ");
            int j = 1;
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
                }
                j++;
            }
            i++;
        }
    }
}
