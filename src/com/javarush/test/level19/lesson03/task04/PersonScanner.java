package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;

public interface PersonScanner {
    String read() throws IOException;

    void close() throws IOException;
}
