public class SalesPerson implements Comparable<SalesPerson>{
    private String firstName;
    private String lastName;
    private int totalSales;

    //constructor
    public SalesPerson(String FN, String LN, int TS) {
        firstName = FN;
        lastName = LN;
        totalSales = TS;
    }
    
    public String toString() {
        return "<" + lastName + "> , <" + firstName + "> : <" + totalSales + ">";
    }

    //check if two sales person have the same first and last name
    public boolean equals(Object obj) {
        //returns false if obj is null or not a sales person
        if (!(obj instanceof SalesPerson)) { 
            return false;
        }

        SalesPerson other = (SalesPerson) obj; //explicit downcast
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }

    public int compareTo(SalesPerson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales; //return + if bigger, return - if smaller
        } else {
            return this.lastName.compareTo(other.lastName);
        }

    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getTotalSales(){return totalSales;}

}
