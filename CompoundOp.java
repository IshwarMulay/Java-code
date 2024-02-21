//Java program to demonstrate Compound assignment operator


class CompoundOp
{
    public static void main(String[] args)
    {
        double age1 = 2.5;
        int age = 10;


/*
age = age + age1;
System.out.println(age);
*/

        // Using compound assignment operator to add 'age1' to 'age' after converting 'age1' to int
        age += age1;

        System.out.println(age);
    }
}


/* Output:
   Compile time: Success
   Run time: 68
*/