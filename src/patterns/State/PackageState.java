package patterns.State;
//Этот интерфейс будет реализован каждым конкретным классом состояния.
public interface PackageState {
    void next(Package pkg);//следующее состояние
    void prev(Package pkg);//предыдущее состояние
    void printState();
}
