package com.javarush.test.level13.lesson11.home03;
import java.io.*;
/**
 * Created by User on 27.03.16.
 */

public class BufferedInputFile {
        // Throw exceptions to console:
        public static String
        read(String filename) throws IOException {
            // Reading input by lines:
            FileReader a = new FileReader(filename);
            BufferedReader in = new BufferedReader(a);
            String s;
            StringBuilder sb = new StringBuilder();
            while((s = in.readLine())!= null)
                sb.append(s + "\n");
            in.close();
            return sb.toString();
        }
        public static void main(String[] args)
                throws IOException {
            System.out.print(read("d:\\22"));
        }
}

