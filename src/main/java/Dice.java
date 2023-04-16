public class Dice {
    public final int dice;

    public Dice (int dice) {
        this.dice = dice;
    }

    public static void rollDice(int num) {
        int currentRoll = tossAndSum(num);
        Bins.addToBin(currentRoll);
        Bins.addToResult(currentRoll);
    }

    public static int tossAndSum(int num) {
        return (int) Math.round((Math.random() * (6 - 1) + 1) * num);
    }
}
