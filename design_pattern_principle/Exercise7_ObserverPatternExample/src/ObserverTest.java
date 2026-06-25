public class ObserverTest {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 195.50);

        stockMarket.removeObserver(webApp);

        stockMarket.setStockPrice("AAPL", 198.75);
    }
}
