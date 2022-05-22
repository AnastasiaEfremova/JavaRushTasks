package com.company.JavaCore.Level_6.BonusTasks.FactoryMethodPattern;

import com.company.JavaCore.Level_6.BonusTasks.FactoryMethodPattern.Common.BmpReader;
import com.company.JavaCore.Level_6.BonusTasks.FactoryMethodPattern.Common.JpgReader;
import com.company.JavaCore.Level_6.BonusTasks.FactoryMethodPattern.Common.PngReader;

import java.io.Reader;

import static com.company.JavaCore.Level_6.BonusTasks.FactoryMethodPattern.ImageTypes.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        ImageReader imageReader;
        switch (type) {
            case BMP:
                imageReader = new BmpReader();
                break;
            case JPG:
                imageReader = new JpgReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
//        if (type == ImageTypes.BMP) {
//            imageReader = new BmpReader();
//        } else if (type == ImageTypes.JPG) {
//            imageReader = new JpgReader();
//        } else if (type == ImageTypes.PNG) {
//            imageReader = new PngReader();
//        } else {
//            throw new IllegalArgumentException("Неизвестный тип картинки");
//        }

        return imageReader;
    }
}

