package main;

import patterns.strategy.Android;
import patterns.strategy.Notifier;
import patterns.strategy.Sms;
import patterns.strategy.Telegram;
//Стратегия – это поведенческий паттерн проектирования,
// который определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс,
// после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.


public class MainStrategy {
    public static void main(String[] args) {
        Notifier testNote = new Android(new Android(new Telegram(new Sms())));
        testNote.push("Hello world!");
    }
}