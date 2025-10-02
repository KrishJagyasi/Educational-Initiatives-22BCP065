public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("--- Online Auction System ---");

        AuctionItem vintageCar = new AuctionItem("1969 Ford Mustang", 25000.0);

        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        vintageCar.registerObserver(bidder1);
        vintageCar.registerObserver(bidder2);
        vintageCar.registerObserver(bidder3);

        vintageCar.placeBid(bidder2, 26000.0);
        vintageCar.placeBid(bidder3, 25500.0); // This bid will be rejected
        vintageCar.placeBid(bidder1, 27500.0);
    }
}