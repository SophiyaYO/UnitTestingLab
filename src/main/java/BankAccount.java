import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    List<Double> money;

    public BankAccount() {
        this.money = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("No money bitch!");
        }
        this.money.add(amount);
    }

    public double getBalance() {
        return this.money.stream()
                .mapToDouble(s-> s)
                .sum();

    }

}
