import org.junit.Assert;
import org.junit.Test;

public class BankAccountTests {

    @Test// with this annotation JUnit knows  that this is Test and will treat it as Test
    public void depositShouldAddMoney() {
        BankAccount account = new BankAccount();
        account.deposit(50);
        Assert.assertEquals(50, account.getBalance(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void depositWithNegativeValueShouldThrowException() {
        BankAccount account = new BankAccount();
        account.deposit(-50);
    }
}
