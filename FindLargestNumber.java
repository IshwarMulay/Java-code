// Java program to find the largest number among 4 numbers using ternary operator

class FindLargestNumber 
{
    public static void main(String[] args) 
{        
        int a = 25;
        int b = 18;
        int c = 30;
        int d = 15;

        // Using nested ternary operators to find the largest number
        int largestNumber = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
                : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

        System.out.println("The largest number is:" + largestNumber);
    }
}

/* Output:
   Compile time: Success
   Run time: The largest number is:30
*/
