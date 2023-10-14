package patterns.strategy;

//Класс Sms реализует интерфейс Notifier и представляет отправку уведомлений по СМС.
public class Sms implements Notifier{
    @Override
    public void push(String message) {//реализация стратегии
        System.out.println("SMS message");
        System.out.println(message);
    }
}
