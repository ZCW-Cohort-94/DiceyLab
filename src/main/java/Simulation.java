import java.util.Scanner;

public class Simulation {
    Dice dice = new Dice();
    Bins bins = new Bins();
    private Integer numberOfDice;
    private Integer numberOfRolls;

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){

    }//end of main

    public Simulation() {
        numberOfDice = 2;
        numberOfRolls = 2;
    }

    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        setNumberOfDice(numberOfDice);
        setNumberOfRolls(numberOfRolls);
        dice.Roll(numberOfDice, numberOfRolls);
    }

    public void setNumberOfDice(Integer numberOfDice){
        this.numberOfDice =numberOfDice;
    }

    public void setNumberOfRolls(Integer numberOfRolls){
        this.numberOfRolls = numberOfRolls;
    }

    public Integer getNumberOfDice(){
        return numberOfDice;
    }

    public Integer getNumberOfRolls(){
        return numberOfRolls;
    }



}