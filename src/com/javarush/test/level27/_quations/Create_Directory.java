package com.javarush.test.level27._quations;

import java.io.File;

/**
 * Created by vasiliev on 16.09.2016.
 */
public class Create_Directory {
    //Create directory and child pathname



    public static void main(String[] args) {
        String fName = "d:\\tmp";
        String child = "one_level\\two_level";
        Create_Directory dir = new Create_Directory();
        File file = new File(fName, child);
        file.mkdirs();

    }
}
