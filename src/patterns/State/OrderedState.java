package patterns.State;

//класс состояния после заказа посылки(корневое состояние)
public class OrderedState implements PackageState{
    @Override
    public void next(Package pkg) {//следующим состоянием будет "доставляется"
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("Посылка находится в своём корневом состоянии");
    }

    @Override
    public void printState() {
        System.out.println("Посылка находится в корневом состоянии. Посылка ещё не доставлена в офис");
    }
}
