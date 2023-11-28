package patterns.command;
//инициализатор
//класс принимает команды (receiver)
public class Light {
    public Light() {
    }

    public void turnOn(){
        System.out.println("Свет включён.");
    }

    public void turnOff(){
        System.out.println("Свет выключен.");
    }

}
