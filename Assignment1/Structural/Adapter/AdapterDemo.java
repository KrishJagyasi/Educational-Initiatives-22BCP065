public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("--- Weather App ---");
        // The client code doesn't know about the NewWeatherApi,
        // it only works with the IWeatherService interface.
        IWeatherService weatherService = new WeatherApiAdapter();
        
        double temp = weatherService.getTemperature("Ahmedabad");
        System.out.println("\nClient received temperature: " + temp + " degrees.");
    }
}