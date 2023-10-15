package main;

import patterns.singleton.Database;

//Синглтон — это шаблон (паттерн) проектирования, который делает две вещи:
//Дает гарантию, что у класса будет всего один экземпляр класса.
//
//Предоставляет глобальную точку доступа к экземпляру данного класса.
//
//Отсюда — две особенности, характерные для практически каждой реализации паттерна синглтон:
//Приватный конструктор. Ограничивает возможность создания объектов класса за пределами самого класса.
//
//Публичный статический метод, который возвращает экземпляр класса. Данный метод называют getInstance.
// Это глобальная точка доступа к экземпляру класса.

public class MainSingleton {
    public static void main(String[] args) {

        Database link = Database.getInstance("http");
        Database lin1 = Database.getInstance("http/");
        Database lin2 = Database.getInstance("http");

        //проверка адреса(они все одинаковые)
        System.out.println(link);
        System.out.println(lin1);
        System.out.println(lin2);
    }
}
