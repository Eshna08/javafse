public class StrategyTest {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(150.0);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(75.0);
    }
}
