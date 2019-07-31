import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class DummyTests {

    @Test
    public void dummyShouldLosesHealthAttacked() {
        Axe axe = new Axe(10, 10);
        Dummy target = new Dummy(20,10);

        axe.attack(target);

        Assert.assertEquals(10, target.getHealth());

    }

    @Test
    public void dummyShouldThrowExceptionIfAttacked() {
        //todo
    }

    @Test
    public void deadDummyXP() {
        //todo
    }
}
