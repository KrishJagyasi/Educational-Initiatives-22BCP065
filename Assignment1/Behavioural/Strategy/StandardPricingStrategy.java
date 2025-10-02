

// A Concrete Strategy
public class StandardPricingStrategy implements PricingStrategy {
    private static final double BASE_FARE = 5.0;
    private static final double PER_KILOMETER_RATE = 2.0;
    private static final double PER_MINUTE_RATE = 0.5;

    @Override
    public double calculatePrice(TripDetails tripDetails) {
        return BASE_FARE + (tripDetails.getDistanceInKm() * PER_KILOMETER_RATE) + (tripDetails.getTimeInMinutes() * PER_MINUTE_RATE);
    }
}