package refactoringGuru.strategy.strategies;

public interface PayStrategy {
    boolean pay(int payment);
    void collectPaymentDetails();
}
