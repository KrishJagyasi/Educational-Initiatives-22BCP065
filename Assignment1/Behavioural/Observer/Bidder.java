public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String itemName, double newBid) {
        System.out.printf("Notification for %s: The new highest bid for '%s' is now $%.2f%n", name, itemName, newBid);
    }
    
    @Override
    public String toString() {
        return name;
    }
}