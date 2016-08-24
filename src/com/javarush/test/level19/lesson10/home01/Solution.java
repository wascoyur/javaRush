package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/



import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fName = args[0];
        FileInputStream fis = new FileInputStream(fName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Map<String, Double> list = new TreeMap<>();
        for (int i = 0; br.ready();i++) {
            String s = br.readLine();
            String[] sMass = s.split(" ");
            if (list.containsKey(sMass[0])) {
                double tmp = list.get(sMass[0]);
                double tmp2 = (Double.parseDouble(sMass[1]));
                tmp = tmp + tmp2;
                list.put(sMass[0],tmp);
            }
            else
            list.put(sMass[0],(Double.parseDouble(sMass[1])));
        }

        Iterator<Map.Entry<String,Double>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> pair = iterator.next();
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " " + value);
        }
        fis.close(); br.close();


    }
}
