// Java program to check if a number is odd or not

class OddOrNot
{
    public static void main(String[] args)
    {
        int a = 12;
        int b = 13;
        int c = 15;
        int d = 17;
        int e = 18;
        int f = 19;
        int g = 21;
        int h = 22;

        boolean A = a % 2 == 1;
        System.out.println("The number is Odd: " + A);

        boolean B = b % 2 == 1;
        System.out.println("The number is Odd: " + B);

        boolean C = c % 2 == 1;
        System.out.println("The number is Odd: " + C);

        boolean D = d % 2 == 1;
        System.out.println("The number is Odd: " + D);

        boolean E = e % 2 == 1;
        System.out.println("The number is Odd: " + E);

        boolean F = f % 2 == 1;
        System.out.println("The number is Odd: " + F);

        boolean G = g % 2 == 1;
        System.out.println("The number is Odd: " + G);

        boolean H = h % 2 == 1;
        System.out.println("The number is Odd: " + H);
    }
}

/* Output:
   Compile time: Success
   Run time: The number is Odd: false
	     The number is Odd: true
	     The number is Odd: true
	     The number is Odd: true
	     The number is Odd: false
	     The number is Odd: true
             The number is Odd: true
    	     The number is Odd: false
*/
