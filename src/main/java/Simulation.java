public class Simulation {
    int diceNum;
    Bins bin = new Bins(2,12);
    Dice dice;
    int rollNum;

    public Simulation(int diceNum, int rollNum) {
        this.rollNum = rollNum;
        this.dice = new Dice(diceNum);
        this.diceNum = diceNum;
    }


    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }



    private void printResults() {
        System.out.printf("***\nSimulation of %d dice tossed %d times.\n***\n\n", diceNum, rollNum);
        double binValue;
        for (int i = 2; i <= 12; i++) {
            binValue = bin.getBin(i);
            if(i<10){
                System.out.print(" ");
            }
            System.out.printf("%d :", i); //below print ensures proper number of spaces
            System.out.print(" ".repeat(9-String.valueOf(binValue).length()));
            System.out.print((int) binValue);
            System.out.printf(": %.2f", binValue/rollNum);
            System.out.print(" ");
            System.out.println("*".repeat((int) Math.round(binValue/(rollNum/100))));

        }

    }

    private void runSimulation() {
        for (int i = 0; i < this.rollNum; i++) {
            bin.increment(dice.tossAndSum());
        }
    }

}
