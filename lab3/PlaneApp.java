package lab3;
import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();
        int choice;

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seats assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        //using a do-while loop -> we always want it to happen atleast once
        do {
            System.out.print("Enter the number of your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    System.out.println("The following seats are empty:");
                    plane.showEmptySeats();
                    break;
                case 3:
                    System.out.println("The seat assignment are as follow:");
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    System.out.println("The seat assignments are as follow:");
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    System.out.print("Please enter SeatID: ");
                    int seatId = sc.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    int custId = sc.nextInt();
                    plane.assignSeat(seatId, custId);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    int seat_id = sc.nextInt();
                    plane.unAssignSeat(seat_id);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        } while (choice != 7);
    } 
}
