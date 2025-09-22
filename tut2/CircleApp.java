package tut2;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = null; //declared here so that all choices can access circle

        while (true) {
            System.out.println("==== Circle Computation =====");
            System.out.println("|1. Create a new circle |");
            System.out.println("|2. Print Area |");
            System.out.println("|3. Print circumference |");
            System.out.println("|4. Quit |");
            System.out.println("=============================");
            System.out.print("Choose option (1-4):\n");

            if (!sc.hasNextInt()) {              
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                sc.next(); // consume bad token
                continue;
            }
            
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter a radius to compute the area and circumference");
                    if (!sc.hasNextDouble()) {
                        System.out.println("Invalid radius!");
                        sc.next(); //consume bad token
                    } else {
                        double rad = sc.nextDouble();
                        circle = new Circle(rad); 
                        System.out.println("A new circle is created");
                    }
                    break;

                case 2: 
                    if (circle == null) {
                        System.out.println("No circle exists. Please create a circle first");
                    } else {
                        circle.printArea();
                    }
                    break;

                case 3:
                    if (circle == null) {
                        System.out.println("No circle exists. Please create a circle first");
                    } else {
                        circle.printCircumference();
                    }
                    break;

                case 4:
                    System.err.println("Thank you!!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
