// Java program to demonstrate Compound assignment operator(-=)

class CompoundOp1 
{
    public static void main(String[] args) 
{
        double age1 = 2.5;
        int age = 10;

        // Using compound assignment operator to subtract 'age1' from 'age' after converting 'age1' to int
        age -= age1;

        System.out.println(age);
    }
}

/* Output:
   Compile time: Success
   Run time: 7
*/
