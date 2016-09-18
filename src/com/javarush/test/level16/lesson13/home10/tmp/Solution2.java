package com.javarush.test.level16.lesson13.home10.tmp;

import java.io.*;

/**
 * Created by yur on 18.09.2016.
 */
public class Solution2{
    public static String firstFileName;
    public static String secondFileName;
    static {
//        try
//        {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            firstFileName = reader.readLine();
//            secondFileName = reader.readLine();
//            reader.close();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
        firstFileName = "d:\\f1";
        secondFileName = "d:\\f2";
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public static interface ReadFileInterface{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    private static class ReadFileThread extends Thread implements ReadFileInterface
    {
        private String fileName;
        private StringBuilder fileContent = new StringBuilder();
        @Override
        public void setFileName(String fullFileName)
        {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            return fileContent.toString();
        }
        public void run(){
            synchronized (this){
                try
                {
                    BufferedReader in = new BufferedReader(new FileReader(fileName));
                    String fin;
                    while ((fin = in.readLine()) != null){
                        fileContent.append(fin).append(" ");
                    }
                    in.close();
                }
                catch (FileNotFoundException e)
                {
                    System.out.println("File not found");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
