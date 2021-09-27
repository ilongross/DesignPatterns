package com.ilongross.patterns.generative.singleton;

public class UseHolder {

    private UseHolder() {
    }

    public static UseHolder getInstance() {
        return HolderClass.instance;
    }

    // Вложенный класс инициализируется только при создании объекта во время выполнения программы
    private static class HolderClass {
        public static final UseHolder instance = new UseHolder();
    }

}
