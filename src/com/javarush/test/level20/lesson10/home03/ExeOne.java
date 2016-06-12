package com.javarush.test.level20.lesson10.home03;

import java.io.*;

/**
 * Created by Юрий on 04.05.16.
 */
public class ExeOne {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOut = new FileOutputStream("d:\\f1");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        FileInputStream fileInp = new FileInputStream("d:\\f1");
        ObjectInputStream objInp = new ObjectInputStream(fileInp);
        Object one = new Solution.A("");
        objOut.writeObject(one);
        objOut.close();
        System.out.println(one.toString() + "  original");
        Object loadOne = objInp.readObject();
        System.out.println(loadOne.toString());
        System.out.println(one.equals(loadOne));
    }
}
