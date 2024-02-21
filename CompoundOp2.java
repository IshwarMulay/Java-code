// Java program to demonstrate Compound assignment operator (*=)

class CompoundOp2 
{
    public static void main(String[] args) 
{
        double age1 = 2.5;
        int age = 10;

        // Using compound assignment operator to multiply 'age' by 'age1' after converting 'age1' to int
        age *= age1;

        System.out.println(age);
    }
}

/* Output:
   Compile time: Success
   Run time: 25
*/
