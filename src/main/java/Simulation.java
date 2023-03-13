import java.util.Scanner;
public class Simulation {

    public static Scanner scanner = new Scanner(System.in);
    public static int numOfDice;
    public static int numOfThrows;

    public Simulation(int numOfDice, int numOfThrows){
        this.numOfDice = numOfDice;
        this.numOfThrows = numOfThrows;
    }

    public static void main(String[] args) {
        Bins bin = new Bins();
        System.out.println("How many dice would you like to roll?");
        int numOfDice = scanner.nextInt();
        System.out.println("How many times would you like to roll them?");
        int numOfThrows = scanner.nextInt();

        bin.createBin(numOfDice);
        Simulation sim = new Simulation(numOfDice, numOfThrows);
        runSimulation(sim);
        printResults();
    }

    public static void runSimulation(Simulation sim) {
        Dice dice = new Dice(sim.numOfDice);
        for (int i = 0; i < sim.numOfThrows; i++) {
            dice.rollDice(sim.numOfDice);
        }
    }

    public static void printResults() {
        System.out.println("***\nSimulation of " + numOfDice + " dice tossed for " + numOfThrows + " times.\n***");
        Bins.printMapResults();
    }

}
