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

    private PlaneSeat[] sortSeats() {
        //create a copy for modification
        PlaneSeat[] sortedSeats = new PlaneSeat[12];
        for (int i = 0; i <12; i++) {
            sortedSeats[i] = seats[i];
        }

        //bubble sort by customerID
        for (int i = 0; i < sortedSeats.length -1; i++) {
            for (int j = 0; j < sortedSeats.length -i - 1; j++) {
                if (sortedSeats[j].getCustomerID() > sortedSeats[j+1].getCustomerID()) {
                    PlaneSeat temp = sortedSeats[j];
                    sortedSeats[j] = sortedSeats[j+1];
                    sortedSeats[j+1] = temp;
                }
            }
        }
        return sortedSeats;
    }

    public void showNumEmptySeats() {
        System.out.println("Number of empty seats: " + numEmptySeat);
    }

    public void showEmptySeats() {
        System.out.println("Empty seats: ");
        boolean foundEmpty = false; //assume seat is occupied

        for (int i = 0; i < seats.length; i++) {
            PlaneSeat currentSeat = seats[i];
            if (!currentSeat.isOccupied()) {
                System.out.println("Seat " +currentSeat.getSeatID());
                foundEmpty = true;
            }
        }

        if (!foundEmpty) { //ie foundEmpty = false -> FULL
            System.out.println("No empty seats available.");
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("Assigned Seats: ");

        if(bySeatId) { //show by seat ID
            for (PlaneSeat seat : seats) {
                if (seat.isOccupied()) {
                    System.out.println("Seat " + seat.getSeatID() + " assigned to Customer " + seat.getCustomerID());
                }
            }


        } else { // show by customer ID
            PlaneSeat[] sortedSeats = sortSeats();
            for (PlaneSeat seat : sortedSeats) {
                if (seat.isOccupied()) {
                    System.out.println("Seat " + seat.getSeatID() + " assigned to Customer " + seat.getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        if (seatId < 1 || seatId > 12) {
            System.out.println("Invalid seat number!");
            return;
        }

        PlaneSeat seat = seats[seatId - 1];
        if (!seat.isOccupied()) {
            seat.assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat "+seatId+" assigned to customer "+cust_id);
        } else {
            System.out.println("Seat " + seatId+ " is already occupied!");
        }

    }

    public void unAssignSeat(int seat_id) {
        PlaneSeat seat = seats[seat_id - 1];
        if (seat.isOccupied()) {
            seat.unAssign();
            numEmptySeat++;
            System.out.println("Seat " + seat_id + " unassigned!");
        } else {
            System.out.println("Seat " + seat_id + " is already empty!");
        }
    }
}
