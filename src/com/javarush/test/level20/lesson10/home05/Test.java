package com.javarush.test.level20.lesson10.home05;

import com.javarush.test.level19.lesson03.task04.Person;

import java.io.*;

/**
 * Created by vasiliev on 27.08.2016.
 */
public class Test {
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("d:\\f1");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Solution.Person person = new Solution.Person("a","z","w", Solution.Sex.MALE);
        oos.writeObject(person);
        FileInputStream fis = new FileInputStream("d:\\f1");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person clone = (Person) ois.readObject();
    }
}
