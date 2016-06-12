package com.javarush.test.level20.lesson10.home02;
import com.javarush.test.level20.lesson10.home02.Solution.A;
import com.javarush.test.level20.lesson10.home02.Solution.B;

import java.io.*;

/**
 * Created by Юрий on 22.05.16.
 */
public class Exec_20_10_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new Solution().new A();
        B b = new Solution().new B();
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\f1");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("d:\\f1");
        ObjectInputStream objectStream = new ObjectInputStream(fileInputStream);
        Object object = objectStream.readObject();
        System.out.println(a.equals((A)object));


    }
}
