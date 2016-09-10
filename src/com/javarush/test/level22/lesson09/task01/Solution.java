package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

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
        String s = "d:\\f1";
        Map<String, String> map = new TreeMap<>();
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(s));
        while (br.ready()) {
            String[] sMass = br.readLine().split(" ");
            for (String x : sMass) {
                set.add(x);
            }
        }
        for (String y : set) {
            map.put(y, null);
        }
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> pair = iterator.next();
                String tmp = pair.getKey();
                String reverse = new StringBuilder(tmp).reverse().toString();
                if (map.containsKey(reverse)) {
                    map.put(tmp, reverse);
                    Set mSet = map.keySet();
                    mSet.remove(tmp);
                }

            }
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (pair.getValue() != null) {
                    result.add(new Pair(pair.getKey(), pair.getValue()));

                }
            }
            System.out.println();
        }
    }

    public static class Pair {
        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
