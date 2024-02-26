//This program checks if a given number is a Buzz number or not using if else

import java.util.Scanner;

class IfElse{
public static void main(String[]args)
{

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();

	//Buzz number is a number that is either divisible by 7 or ends with 7.

	if (num % 7 ==0 || num % 10 == 7)
	{
		System.out.println("Number is Buzz");
	} 
	else
	{
		System.out.println("Number is not Buzz");
	}

}

}


/*OUTPUT:
Compile time : Success
Run time     : Enter the number:77
               Number is Buzz
*/