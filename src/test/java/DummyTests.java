import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class DummyTests {

    private Dummy target;
    private Axe axe;

    @Before
    public void initValues() {
        this.target = new Dummy(20,10);
        this.axe = new Axe(10, 10);
    }

    @Test
    public void dummyShouldLosesHealthAttacked() {
        axe.attack(target);

        Assert.assertEquals(10, target.getHealth());

    }

    @Test(expected = IllegalStateException.class)
    public void dummyShouldThrowExceptionIfAttacked() {
        axe.attack(target);
        axe.attack(target);
        axe.attack(target);
    }

    @Test
    public void deadDummyXP() {
        axe.attack(target);
        axe.attack(target);

        int actual = target.giveExperience();

        Assert.assertEquals(10, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyXP() {
        axe.attack(target);

        int actual = target.giveExperience();

        Assert.assertEquals(10, actual);
    }
}
