package patterns.factory;
//ПРОДУКТ
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Отрендерил");
    }

    @Override
    public void onClick() {
        System.out.println("Кликнул");
    }
}
