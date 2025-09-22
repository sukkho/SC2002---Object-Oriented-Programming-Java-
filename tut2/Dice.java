package tut2;

public class Dice {
    
    private int valueOfDice; //must mention PRIVATE

    //constructor
    public Dice() {
        valueOfDice = 1; //start with 1 until rolled
    }

    //setter (roll the dice)
    public void setDiceValue() {
        valueOfDice = (int)(Math.random()*6) + 1;
    }

    //getter
    public int getDiceValue() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current value is " + valueOfDice);
    }  
}

