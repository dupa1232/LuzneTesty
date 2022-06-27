package refactoringGuru.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /*
    After card validation we can change customer`s credit card.
     */
    @Override
    public boolean pay(int payment) {
        if(cardIsPresent()) {
            System.out.println("Playing " +payment+ " using creditcard.");
            card.setAmount(card.getAmount() - payment);
            return true;
        }
        return false;
    }

    /*
    Collect creditcard data
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the pin number");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date - MM/yy");
            String date = READER.readLine();
            System.out.println("Enter the cvv code");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            /// validate creditcardnumber

        } catch (IOException a) {
            a.getMessage();
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
