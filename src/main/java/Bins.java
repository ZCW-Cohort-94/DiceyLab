import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bins {
    private static DecimalFormat df = new DecimalFormat("0.00");
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
            System.out.println(m.getKey() +
            " :     " +
            m.getValue() +
            ":     " +
            String.format("%.2f", findPercentage(Integer.parseInt(m.getValue().toString())))
            );
        }
    }

    public static double findPercentage(int rollOccurance) {
        return (double) rollOccurance / Simulation.numOfThrows;
    }
}
