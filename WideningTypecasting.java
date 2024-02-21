// Java program to demonstrate Widening Typecasting

class WideningTypecasting
{
    public static void main(String[] args)
    {
        int a = 10;

        // Widening Typecasting: Automatically converting 'int' to 'float'
        // The 'int' value is widened to 'float' without explicit casting
        float b = a;

        System.out.println(b); // Output: 10.0

        int a1 = 10;

        // Explicitly performing Widening Typecasting by casting 'int' to 'float'
        float b1 = (float) a1;

        System.out.println(b1); // Output: 10.0
    }
}

/* Output:
   Compile time: Success
   Run time: 10
*