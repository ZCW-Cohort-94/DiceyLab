import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
class DiceTest {

    @org.junit.jupiter.api.Test
    @Test
    void getNumberOfDice() {
        //When
        Dice die = new Dice(2);

        //Then
        Assert.assertEquals(2, die.getNumberOfDice());
    }

    @org.junit.jupiter.api.Test
    void setNumberOfDice() {
        //Given
        Dice die = new Dice(2);

        //When
        die.setNumberOfDice(3);

        //Then

        Assert.assertEquals(3, die.getNumberOfDice());

    }

    @org.junit.jupiter.api.Test
    void diceRollAndSum() {
        //Given
        Dice die = new Dice(2);

        //When
        die.diceRollAndSum();

        //Then
        Assert.assertEquals(true, die.diceRollAndSum() > 1 || die.diceRollAndSum() < 13);
    }
}