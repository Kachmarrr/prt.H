public class Singleton {
    // Приватний статичний екземпляр класу
    private static Singleton instance;

    // Приватний конструктор, щоб інші класи не могли створити екземпляр
    private Singleton() {
        // Це конструктор класу, ініціалізуємо його за необхідності
    }

    // Глобальна точка доступу до єдиного екземпляра
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Додайте інші методи та властивості, які ви хочете мати у цьому класі
    public void showMessage() {
        System.out.println("Це єдиний екземпляр класу Singleton.");
    }
}

