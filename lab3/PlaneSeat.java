package lab3;

public class PlaneSeat {
    //variables
    private int seatId; 
    private boolean assigned;
    private int customerId;

    //constructor
    public PlaneSeat(int seat_id) {
        seatId = seat_id;
        assigned = false; //initially not assigned
        customerId = 0;   //no customer initially
    }

    //get methods (accessors)
    public int getSeatID() {
        return seatId;
    }

    public int getCustomerID() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }


    //set methods (mutators)
    public void assign(int cust_id) {
        customerId = cust_id;
        assigned = true;
    }

    public void unAssign() {
        customerId = 0;
        assigned = false;
    }
}
