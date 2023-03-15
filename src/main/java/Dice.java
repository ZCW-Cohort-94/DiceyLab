import java.util.Random;

public class Dice {
    int number;
    int sides;

    public  Dice(){
        number = 1;
        sides = 6;
    }

    public Dice(Integer numberOfDice, Integer numberOfSides){
        this.number = numberOfDice;
        this.sides = numberOfSides;
    }

}

