package patterns.strategy;

//Класс Android - это конкретная реализация декоратора NotifierDecorator.
// Он представляет отправку уведомлений на устройства Android.
public class Android extends NotifierDecorator {
    public Android(Notifier notifier) {//конструктор
        super(notifier);//родительское поле
    }

    @Override
    public void push(String message) {//реализация стратегии для класса Android
        System.out.println("ANDROID message");
        super.push(message);
    }
}
