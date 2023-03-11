import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void testDiceConstructor(){
        int expected = 2;
        Dice die = new Dice(2);

        int actual = die.getDiceNum();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTossAndSum(){
        int expected = 9; //seed is same for checking purposes
        Dice die = new Dice(2);

        int actual = die.tossAndSum();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetDiceNum() {
        int expected = 5;
        Dice die = new Dice(5);

        int actual = die.getDiceNum();

        Assert.assertEquals(expected,actual);
    }
}
