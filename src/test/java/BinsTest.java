import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {


    @Test
    void getResultAtBin() {
        //Given
        Bins bin = new Bins();

        //When
        bin.setResultRange(1, 4);

        //Then
        Assert.assertEquals((Integer)0, (Integer)bin.getResultAtBin(1));
    }

    @Test
    void incrementBinValue() {
        //Given
        Bins bin = new Bins();

        //When
        bin.setResultRange(1,3);
        bin.incrementBinValue(1);

        //Then
        Assert.assertEquals((Integer)1, bin.getResultAtBin(1));
    }
}