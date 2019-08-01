import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class HeroTest {

    private static final int DEFAULT_EXPERIENCE = 10;
    private static final int DEFAULT_TARGET_HEALTH = 0;
    private static final int DEFAULT_WEAPON_ATTACK_POINTS = 10;
    private static final int DEFAULT_WEAPON_DURABILITY_POINTS = 0;
    private static final boolean DEFAULT_IS_TARGET_DEAD = Boolean.TRUE;
    private static final String HERO_NAME = "Stamatka";

    @Test
    public void stackGainsExperienceIfTargetIsDead() {

        Target mockTarget = Mockito.mock(Target.class);
        Mockito.when(mockTarget.giveExperience()).thenReturn(10);
        Mockito.when(mockTarget.isDead()).thenReturn(Boolean.TRUE);

        Weapon mockWeapon = Mockito.mock(Weapon.class);
        Mockito.when(mockWeapon.getAttackPoints())
                .thenReturn(DEFAULT_WEAPON_ATTACK_POINTS);

        Mockito.when(mockWeapon.getDurabilityPoints())
                .thenReturn(DEFAULT_WEAPON_DURABILITY_POINTS);

        Target target = new Target() {


        hero.attack(target);
        Assert.assertEquals(DEFAULT_EXPERIENCE, hero.getExperience());


        //            @Override
//            public int getHealth() {
//                return DEFAULT_TARGET_HEALTH;
//            }
//
//            @Override
//            public void takeAttack(int attackPoints) {
//
//            }
//
//            @Override
//            public int giveExperience() {
//                return DEFAULT_EXPERIENCE;
//            }
//
//            @Override
//            public boolean isDead() {
//                return DEFAULT_IS_TARGET_DEAD;
//            }
//        };
//
//        Weapon weapon = new Weapon() {
//            @Override
//            public int getAttackPoints() {
//                return DEFAULT_WEAPON_ATTACK_POINTS;
//            }
//
//            @Override
//            public int getDurabilityPoints() {
//                return DEFAULT_WEAPON_DURABILITY_POINTS;
//            }
//
//            @Override
//            public void attack(Target target) {
//
//            }
//        };
            Hero hero = new Hero(weapon, HERO_NAME);
        }
}
