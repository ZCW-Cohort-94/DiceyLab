import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {
    @Test
    private void setNumberOfDice(){
        //Given
        Integer expectedNumber = 4;
        //When
        Simulation sim = new Simulation(expectedNumber, null);
        //Then
        Integer actualNumber = sim.getNumberOfDice();
        Assert.assertEquals(expectedNumber, actualNumber);
    }

}



