public class NewWeatherApi {
    // Represents a more complex data object from the new API
    public static class WeatherData {
        public final double temp;
        public final String unit;
        public WeatherData(double temp, String unit) {
            this.temp = temp;
            this.unit = unit;
        }
    }
    
    public WeatherData fetchData(String city) {
        // In a real scenario, this would make a network call
        System.out.println("NewWeatherApi: Fetching data for " + city + "...");
        if ("Ahmedabad".equalsIgnoreCase(city)) {
            return new WeatherData(35.5, "Celsius");
        }
        return new WeatherData(20.0, "Celsius");
    }
}