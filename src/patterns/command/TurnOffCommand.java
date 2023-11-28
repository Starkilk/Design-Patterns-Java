package patterns.command;
//исполнитель

//Необходимо инкапсулировать выполнение умений класса Light.
// Для этого мы создадим классы TurnOnLightCommand и TurnOffLightCommand,
// которые реализуют интерфейс Command и которые будут принимать в конструкторе объект класса Light.
// И каждый из них будет выполнять только одно действие. Один будет вызывать метод turnOn(), а другой turnOff().
public class TurnOffCommand implements Command{
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOff();
    }
}
