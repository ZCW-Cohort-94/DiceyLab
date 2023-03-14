import java.util.Random;

public class Dice extends Bins {

    public void Roll(Integer numberOfDice, Integer numberOfRolls) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i<numberOfRolls; i++){
            for(int j = 0; j<numberOfDice; j++){
                sb.setLength(0);
                sb.append("Roll #" + count);
                map.put(sb.toString() ,rand.nextInt(11)+2);
                count++;
            }
        }
    }
}

