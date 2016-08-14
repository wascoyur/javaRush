package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:\\f1"));
        int sizeFile = (int)new File("d:\\f1").length();
        char[] ch = new char[sizeFile];
        br.read(ch, 0, sizeFile);
        String s = String.valueOf(ch);
        String[] words = s.split(" ");
        String clear = words[words.length -1].toString().trim();
        words[words.length - 1] = clear;
        String[] cloneWord = new String[words.length];
        cloneWord = words;
        for (String x : words) {
            StringBuilder reverse = new StringBuilder(x);
            reverse = reverse.reverse();
            for (int i = 0; i < cloneWord.length; i++) {
                if (reverse.toString().equals(cloneWord[i])) {
                    result.add(new Pair(x,cloneWord[i]));
                    cloneWord[i] = null;
                }
            }
        }
        System.out.println(s);
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String x, String y) {
            this.first = x;
            this.second = y;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
