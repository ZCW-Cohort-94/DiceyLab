import java.util.LinkedHashMap;
import java.util.Map;

public class Bins {
    public static int runningTotal = 0;
    public static LinkedHashMap<Integer, Integer> bins;
    public Bins(LinkedHashMap<Integer, Integer> bins) {
        this.bins = bins;
    }
    public Bins() {
        this(new LinkedHashMap<>());
    }
    public static void createBin(int numOfDice) {
        int max = numOfDice * 6;
        for (int i = numOfDice; i <= max; i++) {
            bins.put(i, 0);
        }
    }
    public static void addToBin(int currentRoll) {
        bins.merge(currentRoll, 1, Integer::sum);
    }
    public static void addToResult(int currentRoll) {
        runningTotal += currentRoll;
    }
    public static void printMapResults() {
        for(Map.Entry m:bins.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }
    }
}
