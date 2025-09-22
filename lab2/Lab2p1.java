package lab2;
import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) 
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        do 
        {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            int m,n;

            switch (choice) 
            {
                case 1: /* add mulTest() call */
                    mulTest(sc);
                    break;
                case 2: /* add divide() call */
                    System.out.println("Enter m: ");
                    m = sc.nextInt();
                    System.out.println("Enter n: ");
                    n = sc.nextInt();

                    System.out.println(m+"/"+n+" = "+divide(m,n));
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Enter m: ");
                    m = sc.nextInt();
                    System.out.println("Enter n: ");
                    n = sc.nextInt();

                    System.out.println(m+" % "+n+" = "+modulus(m,n));
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    int digits = countDigits(n);

                    if (digits != -1) { //not error
                        System.out.println("n: "+n+" - count = "+digits);
                    }
                    break;
                case 5: /* add position() call */
                    System.out.println("Enter n: ");
                    n = sc.nextInt();

                    System.out.println("Enter digit: ");
                    int digit = sc.nextInt();

                    System.out.println("position = " + position(n, digit));
                    
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("Enter n: ");
                    long n6 = sc.nextLong();
                    
                    if (n6 > 0) {
                        System.out.println("oddDigits = " + extractOddDigits(n6));
                    } else {
                        System.out.println("oddDigits = Error input!!");
                    }

                    break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    /* add a methods here */ 
    //Q3.2
    public static void mulTest(Scanner sc) {
        int count = 0;

        for (int i = 0; i<5; i++){
            int num1 = (int)(Math.random()*9)+1;
            int num2 = (int)(Math.random()*9)+1;
            
            System.out.println("How much is "+num1+" times "+num2+"?");
            int StudentAnswer = sc.nextInt();
            int CorrectAnswer = num1 * num2;

            if (StudentAnswer == CorrectAnswer) {
                count++;
            }
        }
        System.out.println(count+" answers out of 5 are correct.");
    }

    //Q3.3
    public static int divide(int m, int n) {
        int quotient = 0;

        while (m>=n) { //keep subtracting until m < n
            m -= n;
            quotient++;
        }
        return quotient;
    }

    //Q3.4
    public static int modulus(int m, int n) {
        int remainder = 0;

        if (m < n) {
            remainder = m;
        }

        while (m>=n) {
            m -=n;
            remainder = m;
        }

        return remainder;
    }

    //Q3.5 : count the number of digits for a positive integer
    public static int countDigits(int n) {
        if (n<0) {
            System.out.println("n: " + n + " - Error input!!");
            return -1; //to indicate invalid input
        }

        int count = 0;
        int temp = n;

        if (n == 0) {
            return 1;
        }

        while (temp>0) {
            temp /= 10;
            count++;
        }

        return count;
    }

    //Q3.6 : returns first appearance of a specified digit in a positive number n
    public static int position(int n, int digit) {
        int index = 1;

        while (n>0) {
            int remainder = n % 10;

            if (remainder == digit) {
                return index;
            } 
            n /=10;
            index++;
        }
        return -1;
    }

    //Q3.7: extracts the odd digits from a positive number n, and combines the odd digits sequentially into a new number
    public static long extractOddDigits(long n) {
        long result = 0; //to store digits

        while (n>0) {
            long digit = n%10;
            if (digit % 2 != 0) { //odd digit
                result = result*10 + digit;
            }
            n /=10;
        }

        // to get digits in correct order we need to reverse it
        long reversed = 0;
        if (result == 0) {
            return -1; //no odd digits
        }

        while (result >0) {
            reversed = reversed * 10 + result %10;
            result /=10;
        }

        return reversed;
    }

}

        
