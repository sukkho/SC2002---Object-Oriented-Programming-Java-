public class Main {
    
    public static void main(String[] args) {
        System.out.print("I like sushi!"); // use print if we want it to be inn the same line
        System.out.println(" I had it in Osaka."); //use println to create a new line
        System.out.print("It was really good!\n"); //we can also use \n
        System.out.println("Buy me sushi!");

        // to create a variable: 1. delcaration 2. assignment
        int age;
        age = 21;
        System.out.println("My age is " + age);

        double price = 19.9;
        System.out.println("$" + price);

        char grade = 'A';
        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        System.out.println(isStudent);
        if (forSale) {
            System.out.println("It's for sale.");
        }
        else {
            System.out.println("It't not for sale.");
        }

        String name = "Aiya";
        String food = "sushi";
        System.out.println("Hello, " + name + ". Is your favorite food " + food + "?");
    }
}

             