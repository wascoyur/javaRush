package com.javarush.test.Idea_learn;
//https://www.youtube.com/watch?v=y5O8dIW-ROg
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yur on 05.06.2016.
 */
public class Sorter {
    public static void main(String[] args) throws IOException {
        String file = "D:\\Мои документы\\YandexDisk\\Документы\\ЛчР\\JavaProject\\JavaRushHomeWork\\src\\com\\javarush\\test\\Idea_learn\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        /* FileReader r = new FileReader(RelativeFile.class.getClassLoader().getResource("fileName").getPath().replaceAll("%20", " "));*/
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        String[] array = lines.toArray(new String[(lines.size())]);
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
