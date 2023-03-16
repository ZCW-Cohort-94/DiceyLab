import java.util.Random;
import java.util.Scanner;

public class Simulation {
    Bins bins = new Bins();
    private Integer numberOfDice;
    private Integer numberOfRolls;
    private Integer numberOfSides;
    int[] results = new int[11];

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Simulation sim = new Simulation();
        sim.Roll(sim.numberOfRolls);
    }//end of main


    public Simulation() {
        numberOfDice = 2;
        numberOfRolls = 1000000;
        numberOfSides = 6;
    }

    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        setNumberOfDice(numberOfDice);
        setNumberOfSides(numberOfSides);
        setNumberOfRolls(numberOfRolls);
    }

    public void setNumberOfDice(Integer numberOfDice){
        this.numberOfDice =numberOfDice;
    }

    public void setNumberOfRolls(Integer numberOfRolls){
        this.numberOfRolls = numberOfRolls;
    }
    public void setNumberOfSides(Integer numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public Integer getNumberOfDice(){
        return numberOfDice;
    }

    public Integer getNumberOfRolls(){
        return numberOfRolls;
    }
    public Integer getNumberOfSides(){
        return numberOfSides;
    }

    public void Roll(Integer numberOfRolls) {
        int sum = 0;
        Random rand = new Random();
        Dice dice = new Dice(numberOfDice, numberOfSides);
        Bins bins = new Bins();
        for(int i = 0; i<numberOfRolls; i++){
            sum = 0;
            for(int j = 0; j<dice.number; j++){
                sum += rand.nextInt(dice.sides)+1;
            }
            //store sum from number of rolls here
            results = bins.storingNumbers(sum);

        }
        generateDataMap(results);
    }//end of roll

    public void generateDataMap(int[] results) {
        StringBuilder sb = new StringBuilder();
        sb.append("***\nSimulation of " + numberOfDice + " dice thrown "+ numberOfRolls + " times.\n***");
        for (int i = 0; i < bins.bin.length; i++) {
            int value = results[i];
            float percent = (float) value/numberOfRolls;
            int numberOfStars = (int) (percent*100);
            sb.append("\n" + (i+2) + ":" + "  " + value + ": %" + percent + " ");
            for(int j = 0; j<numberOfStars; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }

    }//end of generateDataMap
}// end of class