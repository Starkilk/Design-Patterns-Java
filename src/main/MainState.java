package main;

import patterns.State.Package;

//Основная идея паттерна State состоит в том, чтобы позволить объекту изменять свое поведение без изменения его класса.
// Кроме того, благодаря его реализации код должен оставаться чище без множества операторов if/else.

public class MainState {
    public static void main(String[] args){
        Package pac = new Package();
        pac.printState();

        pac.nextState();
        pac.printState();

        pac.nextState();
        pac.printState();

        pac.nextState();
        pac.printState();
    }
}
