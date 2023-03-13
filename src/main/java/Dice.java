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
        double roll = (Math.random() * (6 - 1) + 1) * num;
        int rollInt = (int)Math.round(roll);
//        System.out.println(rollInt);
        return rollInt;
        //(Math.random() * (upper - lower)) + lower;
    }
}
