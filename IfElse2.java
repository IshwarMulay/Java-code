//This program checks if the entered number is a two-digit number and then determines if it is even or odd using if else

import java.util.Scanner;

class IfElse2{
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	
	if(num >= 10 && num <= 99)
	// if(num/100==0 && num%10!=num) we can use this condition also
	{
		if(num%2==0)
		{
		System.out.println("Number is Even");
		}
		else
		{
		System.out.println("Number is odd");
		}
	}
	else
	{
	System.out.println("Please Enter 2 Digit number");
	}

}

}
