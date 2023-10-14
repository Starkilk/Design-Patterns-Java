package patterns.startegy2_0;

public class Bus implements Way{
    @Override
    public void buildWay() {
        System.out.println("Маршрут от вас до цели построен(Автобус)");
    }
}
