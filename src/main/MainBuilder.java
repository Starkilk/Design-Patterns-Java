package main;

import patterns.builder.Person;

//Паттерн Builder решает проблему с большим количеством необязательных параметров и непоследовательных состояний,
// предоставляя способ пошагового создания объекта.
// Для этого используется метод, который фактически возвращает окончательный объект.
public class MainBuilder {
    public static void main(String[] args) {
        //создание объекта с помощью паттерна Builder
        Person my = Person.builder()
                .nameBuild("Pavel")
                .secondNameBuild("Boltin")
                .ageBuilder(19).build();

    }
}
