package ru.gb.javajun.lib;

import java.lang.reflect.Field;

public class RandomAnnotationProcessor {
    public static void processAnnotation(Object obj) {

        java.util.Random random = new java.util.Random();
        Class<?> objClass = obj.getClass();
        for(Field field : objClass.getDeclaredFields()){
            if(field.isAnnotationPresent(Random.class) && field.getType().isAssignableFrom(int.class)){
                Random anotation = field.getAnnotation(Random.class);
                int min = anotation.min();
                int max = anotation.max();


                try {
                    field.setAccessible(true);
                    field.set(obj, random.nextInt(min, max));
                } catch (IllegalAccessException e) {
                    System.out.println("Не получиловь изменить поля");
                }
            }
        }


    }

}
