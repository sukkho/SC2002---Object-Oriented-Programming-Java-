package lab3;

public class Plane {
    private PlaneSeat[] seats;
    private int numEmptySeat; 

    public Plane() {
        seats = new PlaneSeat[12];
        numEmptySeat = 12; //originally all seats are empty

        //initialise each seat with seat ID (1-12)
        for (int i = 0; i < 12; i++) {
            seats[i] = new PlaneSeat(i+1);
        }
    }

    public void showNumEmptySeats() {
        System.out.println("Number of empty seats: " + numEmptySeat);
    }

    public void showEmptySeats() {

    }

    public void showAssignedSeats(boolean bySeatId) {

    }

    public void assignSeat(int seatId, int cust_id) {

    }

    public void unAssignSeat(int seat_id) {

    }
}
