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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f = br.readLine();
        Map<String,String> map = new LinkedHashMap<>();
        List<String> clone = new LinkedList<>();
        BufferedReader redFile = new BufferedReader(new FileReader(f));
        char[] ch = new char[(int) new File(f).length()];
        redFile.read(ch,0,((int) new File(f).length()));
        String tmp = (String.valueOf(ch).trim());
        String[] array = tmp.split("( |(\\n))");
        for (int i = 0; i < array.length; i++) {
            String t = array[i].replaceAll("\\p{Cntrl}", "");
            array[i] = t;
        }
        Collections.addAll(clone, array);
        for (String x : clone) {
            String tm = x;
            boolean ss = tm.matches("\\W");
            if (tm.equals(tm.matches("\\w"))){map.put(x, null);}
        }

        Iterator<String> x = clone.iterator();
        while (x.hasNext()) {
            StringBuilder t = new StringBuilder(x.next());
            String revers = new StringBuilder(t).reverse().toString();
            if (map.containsKey(revers)) {
                map.remove(revers);
                map.put(t.toString(), revers);
                x.remove();
            }
        }
        Collection<String> collection = map.values() ;
        Iterator<String> iterCol = collection.iterator(); //удаление пустых значений в мапе.
        while (iterCol.hasNext()) {
            String o = iterCol.next();
            if (o == null) iterCol.remove();
        }


        for (Map.Entry<String, String> pair : map.entrySet()) {
            Pair p = new Pair(pair.getKey(), pair.getValue());
            result.add(p);
        }
        for (Pair z : result) {
            System.out.println(z);
        }
        System.out.println();

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
