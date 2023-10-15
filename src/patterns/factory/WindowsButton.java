package patterns.factory;

import javax.swing.*;
import java.awt.*;

//ПРОДУКТ

public class WindowsButton implements Button{

    private final JPanel panel = new JPanel();//контейнер (ТИПО ConstraintLayout)
    private final JFrame frame = new JFrame();//рамка окошка(Типо Activity)
    private  JButton button;//кнопка


    @Override
    public void render() {//метод, который отрисовывает окно при запуске
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//метод устанавливает действие при закрытии окна frame

        JLabel label = new JLabel("Hello World!");//заголовок
        label.setOpaque(true);//сделали заголовок НЕ прозрачным
        label.setFont(new Font("Dialo",Font.BOLD,44));//настроили внешний вид шрифта заголовка
        label.setHorizontalAlignment(SwingConstants.CENTER);//выравнивание по центру

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);//в активити поместили контейнер
        panel.add(label);//в контейнер поместили текстовый заголовок
        onClick();//вызов нашего метода, отрисовалась кнопка и вкл слушатель
        panel.add(button);//в контейнер добавили кнопку

        frame.setSize(320,200);//задали размер активити
        frame.setVisible(true);//сделали активити видимым

    }

    @Override
    public void onClick() {//слушатель на кнопку закрытия окна
        button = new JButton("Exit");//создали кнопку с тексто

        button.addActionListener(e ->{//слушатель нажатия
            frame.setVisible(false);//делаем активити невидимым
            System.exit(0);//завершаем работу JVM без ошибок 0
        });
    }
}
