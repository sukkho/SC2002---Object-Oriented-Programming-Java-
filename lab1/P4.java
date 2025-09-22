package lab1;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        //prompt user for height input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();

        if (height <= 0) 
        { 
            System.out.println("Error input!!");
        } else 
        {
            String pattern = "";
            for (int i = 1; i <= height; i++) //i is line number 1 to height
            {
                if (i%2 == 1) //odd 
                {
                    pattern = "AA" + pattern; //adds to the front
                } else //even
                {
                    pattern = "BB" + pattern; //adds to the front
                }
                System.out.println(pattern);

            }
        }
        sc.close();
    }
}
