import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class AuctionItem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String itemName;
    private double currentBid;
    private Observer highestBidder;

    public AuctionItem(String itemName, double startingPrice) {
        this.itemName = itemName;
        this.currentBid = startingPrice;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(itemName, currentBid);
        }
    }

    public void placeBid(Observer bidder, double newBid) {
        System.out.printf("%n--- New bid of $%.2f for '%s' from %s ---%n", newBid, itemName, bidder);
        if (newBid > currentBid) {
            this.currentBid = newBid;
            this.highestBidder = bidder;
            System.out.println("New highest bid accepted!");
            notifyObservers();
        } else {
            System.out.println("Bid is not higher than the current bid. Rejected.");
        }
    }
}