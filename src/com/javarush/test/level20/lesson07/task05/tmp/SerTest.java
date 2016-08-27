package com.javarush.test.level20.lesson07.task05.tmp;

import java.io.*;

/**
 * Created by vasiliev on 26.08.2016.
 */
public class SerTest {
     public void serializeToDisk()
    {
        try
        {
            Person ted = new Person("Ted", "Neward", 39);
            Person charl = new Person("Charlotte", "Neward", 38);
            ted.setSpouse(charl); charl.setSpouse(ted);

            FileOutputStream fos = new FileOutputStream("tempdata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ted);
            oos.close();
        }
        catch (Exception ex)
        {
            System.out.println(("Exception thrown during test: " + ex.toString()));
        }

        try
        {
            FileInputStream fis = new FileInputStream("tempdata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person ted = (Person) ois.readObject();
            ois.close();

//            assertEquals(ted.getFirstName(), "Ted");
//            assertEquals(ted.getSpouse().getFirstName(), "Charlotte");

            // Clean up the file
            new File("tempdata.ser").delete();
        }
        catch (Exception ex)
        {
            System.out.println(("Exception thrown during test: " + ex.toString()));
        }
    }
}
