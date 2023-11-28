package patterns.template;

//абстрактный класс, который реализует метод для создания веб страницы
//(внутри метода находится абстрактный метод, который реализуется в каждом классе страницы) Это и есть шаблон

public abstract class WebsiteTemplate {
    public void showPage(){//шаблонный метод
        System.out.println("Header");
        showPageContent();//часть, которая у разных классов имеет свою реализацию
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
