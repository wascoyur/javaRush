package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by yur on 24.07.2016.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes imageTypes) {
        ImageReader reader;
        if (imageTypes == ImageTypes.JPG){
            reader = new JpgReader();
        } else if (imageTypes == ImageTypes.BMP) {
            reader = new BmpReader();
        } else if (imageTypes == ImageTypes.PNG) {
            reader = new PngReader();
        }
         else {throw new IllegalArgumentException();}
        return reader;
    }

}