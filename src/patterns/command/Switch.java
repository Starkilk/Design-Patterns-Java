package patterns.command;
//Oбъект, который бы принимал эти инкапсулированные методы объекта Light.
// Он в терминах паттерна называется вызывающий команды (invoker).
// Назовем его Switch и пусть он будет принимать в конструкторе переменные Command,
// которые будут использоваться в созданных методах flipUp() и flipDown().
public class Switch {
    private Command tOn;
    private Command tOff;

    public Switch(Command tOn, Command tOff) {
        this.tOn = tOn;
        this.tOff = tOff;
    }

    public void switchOn(){
        tOn.execute();
    }

    public void switchOff(){
        tOff.execute();
    }
}
