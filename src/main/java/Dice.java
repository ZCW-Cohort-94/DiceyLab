public class Dice {
    private int numberOfDice = 0;

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }




    public int diceRollAndSum() {
        int throwResult = 0;

        for (int i = 1; i <= this.numberOfDice; i++) {
            throwResult += (int) (Math.random() * 6 + 1);
        }
        return throwResult;
    }

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }
}

