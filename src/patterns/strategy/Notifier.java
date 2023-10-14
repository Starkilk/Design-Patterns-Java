package patterns.strategy;

//Интерфейс Notifier - это интерфейс, описывающий метод push() для отправки уведомлений.
// Классы Android, Sms и Telegram реализуют этот интерфейс для различных способов отправки уведомлений.
public interface Notifier {
    void push(String message);//абстрактный метод отправки уведомления
}
