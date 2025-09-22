package lab1;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //prompt user for salary
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        //prompt user for merit points
        System.out.println("Enter your merit points: ");
        int merit = sc.nextInt();

        String grade;

        //time to categorise the salary
        if (salary >= 700 && salary <= 899) 
        {
            if (salary <= 799) 
            { //can be A or B depending on merit points
                if (merit >= 20) 
                {
                    grade = "A";
                } else 
                {
                    grade = "B";
                }
            } else 
            {
                grade = "A"; // if more than 799 -> "A"
            }
        } else if (salary >= 600 && salary <= 799) 
        {
            if (salary <= 649) 
            { // can be B or C
                if (merit >= 10) 
                {
                    grade = "B";
                } else 
                {
                    grade = "C";
                }
            } else 
            {
                grade = "B"; // if more than 649 -> B
            }
        } else if (salary >=500 && salary <=649) 
        {
            grade = "C";
        } else 
        {
            grade = "Invalid salary range";
        }

        //display results
        System.out.println("salary : $"+salary+", merit : "+merit+"- Grade"+grade);
        sc.close();
    }
}
