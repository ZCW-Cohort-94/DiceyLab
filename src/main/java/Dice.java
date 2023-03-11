import java.util.Random;

public class Dice {

    private int diceNum;
    Random rand;


    public Dice(int i) {
        this.diceNum = i;
        this.rand = new Random(1);
    }

    public int tossAndSum() {
        int total = 0;
        for(int i = 0; i<getDiceNum(); i++){
            total+=rand.nextInt(6)+1;
        }
        return total;
    }

    public int getDiceNum() {
        return this.diceNum;
    }
}
