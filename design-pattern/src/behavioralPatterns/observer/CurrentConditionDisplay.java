package behavioralPatterns.observer;

public class CurrentConditionDisplay implements Observer {
    private Subject weatherStation;

    public CurrentConditionDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }
}
