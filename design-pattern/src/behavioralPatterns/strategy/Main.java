package behavioralPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        TravelPlan travelPlan = new TravelPlan();
        travelPlan.setTransportationStrategy(new AirTravel());
        travelPlan.setAccommodationStrategy(new HotelStay());
        travelPlan.setActivityStrategy(new AdventureSports());
        System.out.println(travelPlan.generatePlan());
    }
}
