package com.javarush.test.level16.lesson13.home10.tmp;

import java.io.*;

/**
 * Created by yur on 17.09.2016.
 */
public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        try{
            firstFileName = "d:\\f1";//reader.readLine();
            secondFileName = "d:\\f2";//reader.readLine();

//        }catch (IOException e)
//        {
//
//        }


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

    public static interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{

        private String fullFileName;

        public ReadFileThread(){}

        @Override
        public void setFileName(String fullFileName)
        {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            //объект, для построения строки
            StringBuilder sb = new StringBuilder();
            String string;

            try{
                //объект, для чтения файла из буффера
                BufferedReader in = new BufferedReader(new FileReader(fullFileName));
                while ((string = in.readLine()) != null){
                    sb.append(string);
                    sb.append(" ");
                }

                in.close();

            }catch (FileNotFoundException e)
            {

            }catch (IOException e)
            {

            }
            return sb.toString();
        }

        @Override
        public void run()
        {
            getFileContent();

        }
    }
}
