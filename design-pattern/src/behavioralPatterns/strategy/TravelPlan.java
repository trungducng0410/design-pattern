package behavioralPatterns.strategy;

public class TravelPlan {
    private TransportationStrategy transportationStrategy;
    private AccommodationStrategy accommodationStrategy;
    private ActivityStrategy activityStrategy;

    public void setTransportationStrategy(TransportationStrategy transportationStrategy) {
        this.transportationStrategy = transportationStrategy;
    }

    public void setAccommodationStrategy(AccommodationStrategy accommodationStrategy) {
        this.accommodationStrategy = accommodationStrategy;
    }

    public void setActivityStrategy(ActivityStrategy activityStrategy) {
        this.activityStrategy = activityStrategy;
    }

    public String generatePlan() {
        StringBuilder plan = new StringBuilder();
        if (transportationStrategy != null) {
            plan.append(transportationStrategy.travelPlan()).append("\n");
        }

        if (accommodationStrategy != null) {
            plan.append(accommodationStrategy.stayPlan()).append("\n");
        }

        if (activityStrategy != null) {
            plan.append(activityStrategy.activityPlan()).append("\n");
        }

        return plan.toString();
    }
}
