import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void testBinsConstructor() {
        int expected = 10;

        Bins bin = new Bins(2,12);

        int actual = bin.getSize();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBin() {
        int expected = 1;
        Bins bin = new Bins(2,12);
        bin.increment(10);

        int actual = bin.getBin(10);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testIncrement() { //idk if I need to write this
        int expected = 1;
        Bins bin = new Bins(2,12);


        bin.increment(10);
        int actual = bin.getBin(10);

        Assert.assertEquals(expected,actual);
    }
}
