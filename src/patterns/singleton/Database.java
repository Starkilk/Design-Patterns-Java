package patterns.singleton;

public class Database {
    private static Database instance;//поле хранит ссылку на единственный объект Database
    private String manager;
    private String conect;
    private String url;


    //конструктор приватный для того, чтобы создать объект можно было только через метод getInstance()
    private Database(String url){//конструктор, требующий только url
        this.url = url;
    }


    public static Database getInstance(String url){
        if(instance == null){//проверяет существует экземпляр класса Database
            instance = new Database(url);//создаёт, если не существует
        }
        return instance;//возвращает, если существует
    }


}
