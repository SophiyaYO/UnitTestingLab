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

    @Test(expected = IllegalStateException.class)
    public void dummyShouldThrowExceptionIfAttacked() {
        Axe axe = new Axe(10, 10);
        Dummy target = new Dummy(20,10);

        axe.attack(target);
        axe.attack(target);
        axe.attack(target);
    }

    @Test
    public void deadDummyXP() {
        Axe axe = new Axe(10, 10);
        Dummy target = new Dummy(20,10);

        axe.attack(target);
        axe.attack(target);

        int actual = target.giveExperience();

        Assert.assertEquals(10, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyXP() {
        Axe axe = new Axe(10, 10);
        Dummy target = new Dummy(20,10);

        axe.attack(target);

        int actual = target.giveExperience();

        Assert.assertEquals(10, actual);
    }
}
