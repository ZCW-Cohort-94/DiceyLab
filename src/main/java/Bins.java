
public class Bins {

    private int higher;
    private int lower;
    int[] bin;

    public Bins(int lower, int higher) {
        this.higher = higher;
        this.lower = lower;
        this.bin = new int[higher-lower];
    }


    public int getSize() {
        return this.bin.length;
    }

    public void increment(int binToIncrement) {
        this.bin[binToIncrement - lower]++;

    }

    public int getBin(int binIndex) {
        return this.bin[binIndex - lower];
    }
}
