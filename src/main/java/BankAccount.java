import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    List<Double> money;

    public BankAccount() {
        this.money = new ArrayList<>();
    }

    public void deposit(double amount) {
        this.money.add(amount - 1);
    }

    public double getBalance() {
        return this.money.stream()
                .mapToDouble(s-> s)
                .sum();

    }

}
