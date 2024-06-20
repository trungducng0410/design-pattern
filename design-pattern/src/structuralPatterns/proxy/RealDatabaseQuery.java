package structuralPatterns.proxy;

public class RealDatabaseQuery implements DatabaseQuery {
    @Override
    public String executeQuery(String query) {
        System.out.println("Executing database query: " + query);
        return "Result of " + query;
    }
}
