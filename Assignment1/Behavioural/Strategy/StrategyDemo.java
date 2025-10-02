public class StrategyDemo {
    public static void main(String[] args) {
        TripDetails tripDetails = new TripDetails(10.0, 20.0); // 10 km, 20 minutes
        Trip trip = new Trip(tripDetails);

        System.out.println("--- Ride-Sharing Pricing ---");

        // Calculate price with standard strategy
        System.out.printf("Standard Price: $%.2f%n", trip.getFinalPrice());

        // A peak hour starts, so we switch the strategy
        System.out.println("\nIt's a peak hour! Switching to peak hour pricing...");
        trip.setPricingStrategy(new PeakHourPricingStrategy());
        System.out.printf("Peak Hour Price: $%.2f%n", trip.getFinalPrice());
    }
}