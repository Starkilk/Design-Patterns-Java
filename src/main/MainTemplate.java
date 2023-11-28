package main;

import patterns.template.NewsPage;
import patterns.template.WebsiteTemplate;
import patterns.template.WelcomePage;
//шаблон упрощает реализацию сложных алгоритмов за счет инкапсуляции логики в одном методе.
public class MainTemplate {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n===========================\n");
        newsPage.showPage();
    }

}
