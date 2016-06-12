package com.javarush.test.level21.lesson05.task02.TMP;

/**
 * Created by Юрий on 22.05.16.
 */
public class Hash {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);
    }
}
