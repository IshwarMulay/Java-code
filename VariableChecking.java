// Java program to compare two variables and print a message indicating which one is greater

class VariableChecking
{
    public static void main(String[] args)
    {
        int v1 = 20;
        int v2 = 21;

        // Using a ternary operator to compare 'v1' and 'v2' and store the result in the 'result' variable
        String result = v1 >= v2 ? "V1 is Greater Variable" : "V2 is Greater Variable";

        System.out.println(result);
    }
}

/* Output:
   Compile time: Success
   Run time: V2 is Greater Variable
*/
