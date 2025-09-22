package tut2;
import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        //roll first dice
        System.out.println("Press <key> to roll the first dice");
        sc.nextLine(); // wait for user to press enter
        dice1.setDiceValue(); //roll dice
        dice1.printDiceValue();

        //roll second dice
        System.out.println("Press <key> to roll the second dice");
        sc.nextLine(); // wait for user to press enter
        dice2.setDiceValue();
        dice2.printDiceValue();

        //calculate total value
        int total = dice1.getDiceValue() + dice2.getDiceValue();
        System.out.println("Your total number is: " + total);

        sc.close();
    }
}
