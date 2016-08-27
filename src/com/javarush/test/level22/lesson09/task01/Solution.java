package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;

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
        BufferedReader br = new BufferedReader(new FileReader(s));
        char[] ch = new char[(int) (new File(s).length())];
        br.read(ch);
        Set<String> setMass = new HashSet<>();
        Set<String> clonesetMass = new HashSet<>();

        String[] mass = (String.valueOf(ch)).trim().split("\\b( )+\\b");
        Collections.addAll(setMass, mass);
        Collections.addAll(clonesetMass, mass);

        for (String source : setMass) {
            StringBuilder sb = new StringBuilder(source).reverse();
            String invert = sb.toString();
            Iterator<String> iter = clonesetMass.iterator();
            while (iter.hasNext() ){
                clonesetMass.iterator();
                if (iter.next().equals(invert) ){
                    result.add(new Pair(source,(invert)));
                    iter.remove();
                    Solution.MyRemove(iter);
                }
            }
        }
        for (Pair x : result) {
            System.out.println(x);
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair(String mas, String s) {
            this.first = mas;
            this.second = s;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

    public static void MyRemove(Iterator iterator) {

    }

}
