public class intelliJSingleton {
    private static intelliJSingleton ourInstance = new intelliJSingleton();

    public static intelliJSingleton getInstance() {
        return ourInstance;
    }

    private intelliJSingleton() {
    }
}
