package main.java.ua.training;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Lenovo", 360, Cores.ONE, 3.9,530);
        Notebook nout1 = new Notebook("Lenovo", 360, Cores.TWO, 2.5,280, 17.5, 2600, 480);
        // Список методов с аннотациями и типами параметров
        // Название пакета и которкое (простое) имя класса
        Class <?> cl = comp1.getClass();
        System.out.println("All fields in class" + cl.getSimpleName() + "\n");
        Method[] metods = cl.getMethods();
        for (Method metod : metods) {
            System.out.println(metod.getName() + " - " + metod.getDeclaredAnnotations().toString() + " - " + metod.getParameterTypes());
        }
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class <?> fieldClass = field.getType();
            System.out.println(field.getName() + " - " + fieldClass.getName());
        }
    }
}