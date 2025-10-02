// A simple data class
public class TripDetails {
    private double distanceInKm;
    private double timeInMinutes;

    public TripDetails(double distanceInKm, double timeInMinutes) {
        this.distanceInKm = distanceInKm;
        this.timeInMinutes = timeInMinutes;
    }

    public double getDistanceInKm() { return distanceInKm; }
    public double getTimeInMinutes() { return timeInMinutes; }
}