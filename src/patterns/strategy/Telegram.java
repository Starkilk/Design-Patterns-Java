package patterns.strategy;

//Класс Telegram - это также конкретная реализация декоратора NotifierDecorator. Он представляет отправку уведомлений через Telegram.
public class Telegram extends NotifierDecorator{
    public Telegram(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void push(String message) {//реализация стратегии для класса Telegram
        System.out.println("TELEGRAM message");
        super.push(message);
    }
}
