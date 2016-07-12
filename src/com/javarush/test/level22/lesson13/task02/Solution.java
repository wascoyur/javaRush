package com.javarush.test.level22.lesson13.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо
записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("");
        FileInputStream fileInputStream = new FileInputStream("");
        Charset UTF8 = Charset.forName("UTF-8");
        Charset win1251 = Charset.forName("windows-1251");
        byte[] buffer = new byte[1000];
        fileInputStream.read(buffer);
        String s = new String(buffer, win1251);
        buffer = s.getBytes(UTF8);
        outputStream.write(buffer);
    }
}
