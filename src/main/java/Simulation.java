import java.util.Scanner;
public class Simulation {
    private static Scanner scanner = new Scanner(System.in);
    public static int numOfDice;
    public static int numOfThrows;
    public Simulation(int numOfDice, int numOfThrows){
        this.numOfDice = numOfDice;
        this.numOfThrows = numOfThrows;
    }
    public static void main(String[] args) {
        Bins bins = new Bins();
        promptRoll();
        numOfDice = scanner.nextInt();
        promptNumOfRolls();
        numOfThrows = scanner.nextInt();
        bins.createBin(numOfDice);
        Simulation sim = new Simulation(numOfDice, numOfThrows);
        runSimulation(sim);
        printResults();
    }
    public static void runSimulation(Simulation sim) {
        for (int i = 0; i < sim.numOfThrows; i++) {
            Dice.rollDice(sim.numOfDice);
        }
    }
    public static void printResults() {
        System.out.println("***\nSimulation of " + numOfDice + " dice tossed for " + numOfThrows + " times.\n***");
        Bins.printMapResults();
    }
    public static void promptRoll(){
        System.out.println("How many dice would you like to roll?");
    }
    public static void promptNumOfRolls(){
        System.out.println("How many times would you like to roll them?");
    }
}
