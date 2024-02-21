// This program compares a character 'A' with an integer entered by the user and checks if they have the same value.

import java.util.Scanner;

class CheckSame 
{
    public static void main(String[] args) 
{
        char a = 'A';
        
        //Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value:");
        int b = sc.nextInt();

        // Use ternary operator to check if the character and integer have the same value
        String result = (a == b) ? "Same value" : "Different value";
        
        System.out.println(result);
    }
}

/* Output:
   Compile time: Success
   Run time: Enter value:
	     65
             Same value
*/