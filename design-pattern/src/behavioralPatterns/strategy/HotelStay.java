package behavioralPatterns.strategy;

public class HotelStay implements AccommodationStrategy {
    @Override
    public String stayPlan() {
        return "Stay in a hotel: Enjoy comfort and luxury services";
    }
}
