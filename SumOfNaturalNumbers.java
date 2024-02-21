// Java program to calculate the sum of the first 'n' natural numbers and check if it's even or odd

class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        int value = 20;

        // Calculating the sum of the first 'n' natural numbers using the formula: n * (n + 1) / 2
        int sum = value * (value + 1) / 2;

        // Checking if the sum is even or odd 
        boolean result = sum % 2 == 0;

        System.out.println("The sum of n natural numbers: " + sum);
        System.out.println("The sum of number is even or odd:" + result);
    }
}

/* Output:
   Compile time: Success
   Run time: The sum of n natural numbers: 210
	     The sum of number is even or odd:true
*/
