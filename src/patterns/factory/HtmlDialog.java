package patterns.factory;
//СОЗДАТЕЛЬ
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
