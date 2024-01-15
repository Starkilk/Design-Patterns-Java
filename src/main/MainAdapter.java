package main;

import patterns.adapter.Letter;
import patterns.adapter.LetterAdapter;
import patterns.adapter.ShortMessage;

//Адаптер - структурный паттерн проектирования, позволяющий объектам с несовместимыми интерфейсами работать вместе
public class MainAdapter {
    public static void main(String[] args) {
        Letter letter = new Letter("Привет, дорогой друг");//письмо

        LetterAdapter adapter = new LetterAdapter(letter);
        //мы хотим передать в метод createTitle письмо, но конструктор не поддерживает этот интерфейс, вот и нужен адаптер
        System.out.println(createTitle(adapter));
    }

    private static String createTitle(ShortMessage shortMessage){
        return "Новое сообщение: " + shortMessage.getShortMessage();
    }
}
