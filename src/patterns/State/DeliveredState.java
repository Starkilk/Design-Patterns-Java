package patterns.State;
//класс состояния - посылка доставляется
public class DeliveredState implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());//следующим состоянием будет "получена"
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printState() {
        System.out.println("Посылка доставлена в почтовое отделение");
    }
}
