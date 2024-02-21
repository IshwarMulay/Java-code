// Java program to demonstrate Narrowing Typecasting

class NarrowingTypecasting
{
    public static void main(String[] args)
    {
        float temp = 15.26f;

        // Narrowing Typecasting: Explicitly converting 'float' to 'byte'
        // The 'float' value is narrowed to 'byte' using explicit casting
        byte city_temp = (byte) temp;

        System.out.println(city_temp);
    }
}

/* Output:
   Compile time: Success
   Run time: 15
*/
