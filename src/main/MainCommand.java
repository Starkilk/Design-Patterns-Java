package main;

import patterns.command.*;
//Паттерн "Команда" (Command) позволяет инкапсулировать запрос на выполнение определенного действия в виде отдельного объекта.
// Этот объект запроса на действие и называется командой.
// При этом объекты, инициирующие запросы на выполнение действия, отделяются от объектов, которые выполняют это действие.
public class MainCommand {
    public static void main(String[] args){
        Light svet = new Light();//используемый объект

        //объекты для всех возможностей объекта svet
        Command switchUp =  new TurnOnCommand(svet);
        Command switchDown =  new TurnOffCommand(svet);

        //создали invoker, с которым мы будем взаимодействовать
        Switch mySwitch = new Switch(switchUp,switchDown);

        mySwitch.switchOn();
        mySwitch.switchOff();
    }
}
