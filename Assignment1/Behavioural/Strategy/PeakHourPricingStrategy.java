// A Concrete Strategy
public class PeakHourPricingStrategy implements PricingStrategy {
    private static final double PEAK_HOUR_MULTIPLIER = 1.8;

    @Override
    public double calculatePrice(TripDetails tripDetails) {
        // Reuse standard pricing logic and apply the multiplier
        double standardPrice = new StandardPricingStrategy().calculatePrice(tripDetails);
        return standardPrice * PEAK_HOUR_MULTIPLIER;
    }
}