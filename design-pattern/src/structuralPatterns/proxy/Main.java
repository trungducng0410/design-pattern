package structuralPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        DatabaseQuery query = new CachedDatabaseQuery();

        System.out.println(query.executeQuery("SELECT * FROM users"));
        System.out.println(query.executeQuery("SELECT * FROM users"));
    }
}
