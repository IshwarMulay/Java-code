// Java program to demonstrate Compound assignment operator (%=)

class CompoundOp4 
{
    public static void main(String[] args) 
{
        double age1 = 2.5;
        int age = 10;

        // Using compound assignment operator to find the remainder when 'age' is divided by 'age1'
        age %= age1;

        // Printing the modified value of 'age'
        System.out.println(age);
    }
}

/* Output:
   Compile time: Success
   Run time: 0
*/
