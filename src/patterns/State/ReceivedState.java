package patterns.State;

public class ReceivedState implements PackageState{
    @Override
    public void next(Package pkg) {
        System.out.println("Посылка уже получена клиентом");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printState() {
        System.out.println("Посылка была получена клиентом");
    }
}
