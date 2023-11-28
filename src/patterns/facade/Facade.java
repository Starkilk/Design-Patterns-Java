package patterns.facade;

public class Facade {
    private Sleeping sl = new Sleeping();
    private Eating ea = new Eating();
    private Coding co = new Coding();

    public void myDay(){
        sl.sleep();
        ea.eat();
        co.code();
    }
}
