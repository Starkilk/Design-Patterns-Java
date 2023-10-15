package patterns.factory;

//MAIN
//Фабрика — это шаблон проектирования, который помогает решить проблему создания различных объектов в зависимости от некоторых условий.
public class Demo {
    public static Dialog dialog;

    public static void main(String[] args) {
        configure();//конфигурация
        runBusinessLogic();//запустить бизнес логику
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();//запусти функцию render у WindowButton или у HtmlButton( это условие будет в configure() )
        //этот метод находится в классе Dialog и вызывается от WindowsDialog или от HtmlDialog
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")){//если на моём компе 10 винда, то:
            dialog = new WindowsDialog();//renderWindow() вызовется от WindowsDialog
        }else {
            dialog = new HtmlDialog();//иначе, renderWindow() вызовется от HtmlDialog
        }

    }
}
