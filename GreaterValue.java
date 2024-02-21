// Java program to find the greatest value among three numbers

class GreaterValue
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 30;

        // Using nested ternary operators to find the greatest value among 'a', 'b', and 'c'
        int result = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println(result);
    }
}

/* Output:
   Compile time: Success
   Run time: 30
*/
