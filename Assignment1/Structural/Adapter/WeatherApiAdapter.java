public class WeatherApiAdapter implements IWeatherService {
    private final NewWeatherApi newApi;

    public WeatherApiAdapter() {
        this.newApi = new NewWeatherApi();
    }

    @Override
    public double getTemperature(String city) {
        System.out.println("Adapter: Translating request for city " + city + " to the new API.");
        NewWeatherApi.WeatherData data = newApi.fetchData(city);
        // The adapter's job is to translate the interface and the data
        return data.temp;
    }
}