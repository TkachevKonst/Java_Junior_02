package ru.gb.javajun.lib;

import java.lang.reflect.Field;
import java.util.Date;

public class RandomDataAnnotationProcessor {
    public static void processAnnotation(Object obj) {

        java.util.Random random = new java.util.Random();
        Class<?> objClass = obj.getClass();
        for (Field field : objClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(RandomDate.class) && field.getType().isAssignableFrom(java.util.Date.class)) {
                RandomDate randomDate = field.getAnnotation(RandomDate.class);
                long min = randomDate.min();
                long max = randomDate.max();
                if (min < max) {
                    try {
                        Date date = new Date(random.nextLong(min, max));
                        field.setAccessible(true);
                        field.set(obj, date);
                    } catch (IllegalAccessException e) {
                        System.out.println("Не получиловь изменить поля");
                    }
                }
            }
        }
    }
}

