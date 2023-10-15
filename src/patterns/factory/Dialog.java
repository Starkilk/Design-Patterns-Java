package patterns.factory;


//абстрактный создатель, содержит ФАБРИЧНЫЙ метод createButton()
public abstract class Dialog {
    public abstract Button createButton();
    public void renderWindow(){
        Button button = createButton();//получаем объект WindowsButton или HtmlButton из WindowsDialog или из HtmlDialog
        button.render();//вызываем метод render от объекта который получили
    }

}
