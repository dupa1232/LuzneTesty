package refactoringGuru.strategy;


import refactoringGuru.strategy.order.Order;
import refactoringGuru.strategy.strategies.PayByCreditCard;
import refactoringGuru.strategy.strategies.PayByPayPal;
import refactoringGuru.strategy.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * World first console e-commerce application.
 */
public class Demo {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while(!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(READER.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("Count: ");
                int count = Integer.parseInt(READER.readLine());
                order.setTotalCost(cost * count);
                System.out.println();
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = READER.readLine();
            } while("Y".equalsIgnoreCase(continueChoice));

            if(strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = READER.readLine();

                // Client creates different strategies based on input from user,
                // application configuration, etc.
                if(paymentMethod.equals("1"))
                    strategy = new PayByPayPal();
                else
                    strategy = new PayByCreditCard();
            }
            // Order object delegates gathering payment data to strategy object,
            // since only strategies know what data they need to process a
            // payment.
            order.processOrder(strategy);

            System.out.println("Pay " +order.getTotalCost()+ " units or Continue shopping? P/C: ");
            String proceed = READER.readLine();
            if("P".equalsIgnoreCase(proceed)) {
                // Finally, strategy handles the paymnet.
                if(strategy.pay(order.getTotalCost()))
                    System.out.println("Payment has been successful");
                else
                    System.out.println("FAIL! Please check your data.");
                order.setClosed();
            }
        }
    }
}
