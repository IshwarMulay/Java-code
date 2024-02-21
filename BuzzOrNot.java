//This is java prgram to check if given number is Buzz number or not and number should be of two digit . If number is more than two digit then display message as Invalid number

import java.util.Scanner;

class BuzzOrNot 
{
    public static void main(String[] args) 
{
        //Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        // Use ternary operator to check if the number is a two-digit number.
	// If it is a two-digit number, check if it is a Buzz number
	// If it is not a two-digit number, display an error message

        String result = (num <= 99 && num >= 10) ?((num % 7 == 0 || num % 10 == 7) ? ("The given number is Buzz") : ("The given number is not Buzz number")) :("Invalid Number");

        System.out.println(result);
    }
}


/* Output:
   Compile time: Success
   Run time: Enter the number:
	     47
             The given number is Buzz
*/
