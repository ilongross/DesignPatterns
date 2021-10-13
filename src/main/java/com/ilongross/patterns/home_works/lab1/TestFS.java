package com.ilongross.patterns.home_works.lab1;

import java.util.List;

public class TestFS {
    public static void main(String[] args) {

        //Создаем экземпляры FSItem
        var file1 = new File();
        file1.setName("file1");
        var link1 = new Link();
        link1.setName("link1");

        // Создаем список файлов №1 из FS и добавляем объеты FSItem
        List<FSItem> list1 = FS.getEntryList();
        list1.add(file1);
        list1.add(link1);

        // Создаем аналогичный список файлов №2, но пустой
        List<FSItem> list2 = FS.getEntryList();

        // Проверяем, имеются ли в списке №2 файлы
        System.out.println("Список файлов в list2:");
        for (FSItem item : list2) {
            System.out.println(item.getName());
        }
        if(!list2.isEmpty() && (list1 == list2))
            System.out.println("Паттерн Singleton использован верно для класса FS.");
        else {
            System.out.println("Ошибка при создании Singleton для класса FS");
        }

    }
}
