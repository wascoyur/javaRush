package com.javarush.test.level20.lesson07.task05.tmp;

import java.io.*;

/**
 * Created by vasiliev on 26.08.2016.
 */
public class FlattenTime implements Serializable{
    public static void main(String [] args){
        String filename = "time.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentTime time = new PersistentTime();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
