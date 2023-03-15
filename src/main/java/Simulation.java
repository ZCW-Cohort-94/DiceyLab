public class Simulation {

    public Simulation(){

    }

    public int getNumberOfThrows() {
        return numberOfThrows;
    }

    public void setNumberOfThrows(int numberOfThrows) {
        this.numberOfThrows = numberOfThrows;
    }

    private int numberOfThrows;

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    private int numberOfDice;

    Dice die = new Dice(2);
    Bins bin = new Bins();
    public void runSimulation(int numberOfDice, int numberOfThrows){
        die.setNumberOfDice(numberOfDice);
        this.numberOfThrows = numberOfThrows;
        bin.setResultRange(numberOfDice , numberOfDice * 6);

        for(int i = 0; i < numberOfThrows; i++){
            int input = die.diceRollAndSum();
            bin.incrementBinValue(input);
        }
    }

    public void printResults(){
        for(int i = 2; i <= 12; i++){
            System.out.println(i + ": " + bin.getResultAtBin(i) + ": " +
                    (float) bin.getResultAtBin(i) / this.numberOfThrows);
        }
    }



    public static void main(String[] args) {


        Simulation sim = new Simulation();
        sim.runSimulation(2, 1000000);
        sim.printResults();
    }


}
