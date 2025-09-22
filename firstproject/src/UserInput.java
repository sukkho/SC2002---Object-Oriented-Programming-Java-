import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        //class, object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //use nextLine if you want it to read spaces, use next to read first string


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What's your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are NOT a student");
        }

        scanner.close();
    }
}

// COMMON ISSUES
/* if we try to take an input of int, then an input of string -> leads to errors in the output
 * we must CLEAR the input buffer first !! for example:
 * System.out.print("Enter your age: ");
 * int age = scanner.nextInt();
 * scanner.nextLine(); <- USE THIS!
 */