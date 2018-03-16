package main.java.ua.training;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Lenovo", 360, Cores.ONE, 3.9,530);
        Notebook nout1 = new Notebook("Lenovo", 360, Cores.TWO, 2.5,280, 17.5, 2600, 480);
        ReflectionMethods rm = new ReflectionMethods(comp1.getClass());
        // Название пакета
        rm.getPackageName();
        // Которкое (простое) имя класса
        rm.getSimpleClassName();
        // Список методов с аннотациями и типами параметров
        rm.getMetods();

        rm = new ReflectionMethods(nout1.getClass());
        // Название пакета
        rm.getPackageName();
        // Которкое (простое) имя класса
        rm.getSimpleClassName();
        // Список методов с аннотациями и типами параметров
        rm.getMetods();
    }
}
