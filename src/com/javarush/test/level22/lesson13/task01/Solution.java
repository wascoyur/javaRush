package com.javarush.test.level22.lesson13.task01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] s = new String[tokenizer.countTokens()];
        ArrayList<String> arrayList = new ArrayList();
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
//            s[i] = tokenizer.nextToken();
//            i++;
            arrayList.add(tokenizer.nextToken());
        }
        System.out.println(Arrays.asList(arrayList));
        s = arrayList.toArray(new String[arrayList.size()]);
        return s;
    }

    public static void main(String[] args) {
        String s = "level22.lesson13.task01";

        getTokens(s, ".");
    }
}
