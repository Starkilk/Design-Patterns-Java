package patterns.strategy;

//Класс NotifierDecorator - это абстрактный декоратор, который реализует интерфейс Notifier и содержит поле типа Notifier.
// Он используется для добавления дополнительной функциональности к базовому классу Notifier.
//Нужен для множественного создания уведомлений в одном объекте
public abstract class NotifierDecorator implements Notifier {
    public Notifier notifier;
    public NotifierDecorator(Notifier notifier) {//конструктор
        this.notifier = notifier;
    }
    @Override
    public void push(String message) {//метод интерфейса
        notifier.push(message);
    }
}
