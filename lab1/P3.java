package lab1;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        double rate = 1.82;
        Scanner sc = new Scanner(System.in);

        //prompt users for input
        System.out.println("Enter your starting value: ");
        int starting = sc.nextInt();

        System.out.println("Enter your ending value: ");
        int ending = sc.nextInt();

        System.out.println("Enter your increment; ");
        int increment = sc.nextInt();

        if (starting > ending || increment <=0) 
        {
            System.out.println("Error input!!");
        }

        // print out tables
        System.out.println("Table 1 (using for loop)");
        System.out.println("  US$           $S  ");
        System.out.println("--------------------");
        for (int usd = starting; usd <= ending; usd +=increment) 
        { // convert USD -> SGD
            double sgd = usd*rate; 
            System.out.printf("%-10d %-10s%n", usd, sgd);
        }

        System.out.println("Table 2 (using while loop)");
        System.out.println("  US$           $S  ");
        System.out.println("--------------------");
        int usd = starting;
        while (usd <= ending) 
        {
            double sgd = usd * rate;
            System.out.printf("%-10d %-10s%n", usd, sgd);
            usd += increment;
        }

        System.out.println("Table 3 (using do-while loop)");
        System.out.println("  US$           $S  ");
        System.out.println("--------------------");
        usd = starting;
        do 
        {
            double sgd = usd*rate;
            System.out.printf("%-10d %-10s%n", usd, sgd);
            usd += increment;
        } while (usd <= ending);

        sc.close();

    }
}
