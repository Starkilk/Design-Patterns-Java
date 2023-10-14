package patterns.builder;

public class Person {//класс персоны
    private final String name;
    private final String secondName;
    private final int age;

    public Person(PersonBuilder personBuilder) {//конструктор через билдер
        this.name = personBuilder.name;
        this.secondName = personBuilder.secondName;
        this.age = personBuilder.age;
    }

    //метод создаёт объект PersonBuilder, для последующего его заполнения и передачи параметров в объект Person
    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder {//класс СТРОИТЕЛЬ
        private String name;
        private String secondName;
        private int age = 0;

        //////конструкторы параметров
        public PersonBuilder nameBuild(String newName) {
            name = newName;
            return this;
        }
        public PersonBuilder secondNameBuild(String newSecondName) {
            secondName = newSecondName;
            return this;
        }
        public PersonBuilder ageBuilder(int newAge) {
            age = newAge;
            return this;
        }
        //////////

        public Person build(){//метод, который возвращает готовый объект
            return new Person(this);//вызываем конструктор Person и передаём в него заполнений нами объект PersonBuilder
        }
    }

}
