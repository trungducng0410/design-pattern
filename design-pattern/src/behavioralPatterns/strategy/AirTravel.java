package behavioralPatterns.strategy;

public class AirTravel implements TransportationStrategy {
    @Override
    public String travelPlan() {
        return "Travel by air: Fast and convenient for long distances.";
    }
}
