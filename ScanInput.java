// Java program to scan and display user input

// Importing the java.util package to use the Scanner class
import java.util.*;

class ScanInput
{
    public static void main(String[] args)
    {
        // Creating a Scanner object named 'sc' to read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value:");
        
	int a = sc.nextInt();

        System.out.println("The Number Is: " + a);

        sc.close();
    }
}

/* Output:
   Compile time: Success
   Run time: Enter The Value:
	     10
	     The Number Is: 10
*/
