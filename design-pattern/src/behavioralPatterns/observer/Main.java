package behavioralPatterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherStation);

        weatherStation.setMeasurements(30.0f, 65f, 1013.1f);
    }
}
