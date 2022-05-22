package com.company.JavaCore.Level_6.BonusTasks.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
            ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);

    }
}
