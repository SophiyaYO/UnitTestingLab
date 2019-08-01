import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class DummyTests {
    private static final int DEFAULT_DUMMY_HEALTH = 20;
    private static final int DEFAULT_DUMMY_EXPERIENCE = 10;
    private static final int DEFAULT_AXE_ATTACK = 10;
    private static final int DEFAULT_AXE_DURABILITY = 10;

    private Dummy target;
    private Axe axe;

    @Before
    public void initValues() {
        this.target = new Dummy(DEFAULT_DUMMY_HEALTH,DEFAULT_DUMMY_EXPERIENCE);
        this.axe = new Axe(DEFAULT_AXE_ATTACK, DEFAULT_AXE_DURABILITY);
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
