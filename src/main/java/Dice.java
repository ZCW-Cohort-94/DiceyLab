import java.util.Random;

public class Dice {

    private int diceNum;


    public Dice(int i) {
        this.diceNum = i;
    }

    public int tossAndSum() {
        int total = 0;
        Random rand = new Random(1);
        for(int i = 0; i<getDiceNum(); i++){
            total+=rand.nextInt(5)+1;
        }
        return total;
    }

    public int getDiceNum() {
        return this.diceNum;
    }
}
