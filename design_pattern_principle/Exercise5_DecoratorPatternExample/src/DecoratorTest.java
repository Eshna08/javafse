public class DecoratorTest {

    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        Notifier smsAndEmail = new SMSNotifierDecorator(notifier);
        Notifier slackSmsAndEmail = new SlackNotifierDecorator(smsAndEmail);

        slackSmsAndEmail.send("Server is down");
    }
}
