package structuralPatterns.proxy;

import java.util.HashMap;
import java.util.Map;

// proxy class
public class CachedDatabaseQuery implements DatabaseQuery {
    private RealDatabaseQuery realDatabaseQuery;
    private Map<String, String> cache = new HashMap<>();

    @Override
    public String executeQuery(String query) {
        if (cache.containsKey(query)) {
            System.out.println("Returning cached result for query: " + query);
            return cache.get(query);
        }

        if (realDatabaseQuery == null) {
            realDatabaseQuery = new RealDatabaseQuery();
        }

        String result = realDatabaseQuery.executeQuery(query);
        cache.put(query, result);
        return result;
    }
}
