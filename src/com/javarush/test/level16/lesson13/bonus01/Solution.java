package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.ImageReaderFactory;
import com.javarush.test.level16.lesson13.bonus01.common.ImageReader;
import com.javarush.test.level16.lesson13.bonus01.common.ImageTypes;

/* Factory method pattern
1. Внимательно посмотри, какие классы у тебя есть.
<<<<<<< HEAD
2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые реализуют интерфейс ImageReader.
=======
2. В отдельных файлах в пакете common создай классы
JpgReader, PngReader, BmpReader, которые реализуют интерфейс ImageReader.
>>>>>>> origin/master
3. В отдельном файле в пакете bonus01 создай класс ImageReaderFactory с одним методом.
3.1. Подумай, как он должен называться.
3.2. Подумай, какие модификаторы должны быть у этого метода.
4. Этот метод должен:
<<<<<<< HEAD
4.1. для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
4.2. если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
=======
4.1. для каждого значения из ImageTypes возвращать соответствующий Reader,
например, для ImageTypes.JPG - JpgReader;
4.2. если передан неправильный параметр,
то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
>>>>>>> origin/master
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getReader(ImageTypes.JPG);
    }
}
