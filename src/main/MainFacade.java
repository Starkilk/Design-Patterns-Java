package main;

import patterns.facade.Facade;
//Проще говоря, фасад инкапсулирует сложную подсистему за простым интерфейсом.
// Он скрывает большую часть сложности и упрощает использование подсистемы.

//скрыли всю работу за одним вызванным методом(в даном примере)
public class MainFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.myDay();
    }
}
