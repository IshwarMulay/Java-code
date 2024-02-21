// Java program to determine if the result of adding two numbers is even or odd Using a ternary operator

class EvenOrOdd
{
    public static void main(String[] args)
    {
        int a = 12;
        int b = 13;
        int c = a + b;
        System.out.println("Addition Of Two Numbers is: " + c);

        int d = c / 10;
        System.out.println(d);

        int e = c % 10;
        System.out.println(e);

        // Adding the two intermediate results ('d' and 'e') and storing the final result in variable 'f'
        int f = d + e;
        System.out.println("Addition: " + f);

        // Using a ternary operator to check if 'f' is even or odd 
        String result = f % 2 == 0 ? "Number is Even" : "Number is Odd";
        System.out.println(result);
    }
}

/* Output:
   Compile time: Success
   Run time: Addition Of Two Numbers is: 25
	     2
	     5
	     Addition: 7
	     Number is Odd
*/
