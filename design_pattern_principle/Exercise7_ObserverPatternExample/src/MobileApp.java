public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("MobileApp notified: " + stockName + " is now $" + price);
    }
}
