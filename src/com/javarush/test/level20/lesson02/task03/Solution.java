package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException {
        //implement this method - реализуйте этот метод
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new FileReader("d:\\f2"));
        while (readFile.ready()) {
            String s = readFile.readLine();
            if (!s.startsWith("#") | s.startsWith("!")) {
                s = s.replaceAll("(:)+"," ");
                s = s.replaceAll("(=)+"," ");
                s = s.replaceAll("( )+"," ");
                String[] sMass = s.split(" ");
                properties.put(sMass[0], sMass[1]);
                System.out.println();
            }

        }
        System.out.println();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) throws IOException {
        Solution one = new Solution();
        one.fillInPropertiesMap();
    }
}
