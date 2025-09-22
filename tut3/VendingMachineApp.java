package tut3;

public class VendingMachineApp {
    public static void main(String[] args) {
        double cost = 0;
        double amount = 0.0;
        VendingMachine vm = new VendingMachine();

        cost = vm.selectDrink();
        if (cost == -1) {
            return; //exit if invalid selection
        }

        amount = vm.insertCoins(cost);
        vm.checkChange(amount, cost);
        vm.printReceipt();
    }
}

