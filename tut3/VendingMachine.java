package tut3;
import java.util.Scanner;

public class VendingMachine {
    private String[] drinks = {"Beer", "Coke", "Green Tea"};
    private double[] prices = {3.0, 1.0, 5.0};
    private Scanner sc = new Scanner(System.in);

    //constructor
    public VendingMachine() {}
    /* using default constructors -> our vending machine will only be able to have the 3 drinks we hardcoded in the selection method
     * make a Drink Class 
     * make the instance variable for the drinks list ie. Drink[] drinks;
     * in the constructor we can initialise the drinks
     */

    public double selectDrink() {
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00)        |");
        System.out.println("|2. Buy Coke ($1.00)        |");
        System.out.println("|3. Buy Green Tea ($5.00)   |");
        System.out.println("|============================|");
        System.out.print("Please enter selection: ");

        int choice = sc.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid selection!");
            return -1;
        }

        System.out.println("You selected: "+drinks[choice-1] + " ($" + prices[choice-1] + ")");
        return prices[choice -1];
    }

    public double insertCoins(double drinkCost) {
        double amount = 0.0;

        System.out.println("========== Coins Input ==========");
        System.out.println("|Enter 'Q' for ten cents input  |");
        System.out.println("|Enter 'T' for twenty cents     |");
        System.out.println("|Enter 'F' for fifty cents      |");
        System.out.println("|Enter 'N' for a dollar input   |");
        System.out.println("=================================");

        while (amount < drinkCost) {
            String coin = sc.next().toUpperCase();

            switch(coin) {
                case "Q": amount += 0.10; break;
                case "T": amount += 0.20; break;
                case "F": amount += 0.50; break;
                case "N": amount += 1.00; break;
                default: System.out.println("Invalid coin input!"); continue;
            }
            System.out.printf("Coin inserted: %.2f\n",amount);
            
        }
        return amount;
    }

    public void checkChange(double amount, double drinkCost) {
        double change = 0.0;
        if (amount > drinkCost) {
            change = amount - drinkCost;
            System.out.printf("Change: $%.2f\n", change);
        }
    }

    public void printReceipt() {
        System.out.println("Please collect your drink");
        System.out.println("Thank You!!");
    } 
}
