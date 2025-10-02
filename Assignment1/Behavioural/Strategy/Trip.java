/**
 * The Context defines the interface of interest to clients. It maintains a
 * reference to one of the Strategy objects.
 */
public class Trip {
    private TripDetails tripDetails;
    private PricingStrategy pricingStrategy;

    public Trip(TripDetails tripDetails) {
        this.tripDetails = tripDetails;
        // Default strategy
        this.pricingStrategy = new StandardPricingStrategy();
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double getFinalPrice() {
        return pricingStrategy.calculatePrice(this.tripDetails);
    }
}