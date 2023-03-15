import java.util.Random;
import java.util.Scanner;

public class Simulation {
    Bins bins = new Bins();
    private Integer numberOfDice;
    private Integer numberOfRolls;
    private Integer numberOfSides;

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Simulation sim = new Simulation();
        sim.Roll(sim.numberOfRolls);
    }//end of main

    public Simulation() {
        numberOfDice = 2;
        numberOfRolls = 1000;
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
        Integer sum = 0;
        Random rand = new Random();
        Dice dice = new Dice(numberOfDice, numberOfSides);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<numberOfRolls; i++){
            sum = 0;
            for(int j = 0; j<dice.number; j++){
                sum += rand.nextInt(dice.sides)+1;
            }
            //store sum from number of rolls here
            System.out.println(sum);
        }
    }


}