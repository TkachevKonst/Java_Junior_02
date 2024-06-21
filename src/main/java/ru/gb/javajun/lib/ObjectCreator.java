package ru.gb.javajun.lib;

import java.lang.reflect.Constructor;

public class ObjectCreator {

    public static  <T> T createObj(Class<T> tClass) {

        try {
            Constructor<T> tConstructor = tClass.getDeclaredConstructor();
            T obj = tConstructor.newInstance();
            RandomAnnotationProcessor.processAnnotation(obj);
            RandomDataAnnotationProcessor.processAnnotation(obj);
            return obj;
        }catch (Exception e) {
            System.err.println("ниче не получилось: " + e.getMessage());
            return null;
        }




    }


}
