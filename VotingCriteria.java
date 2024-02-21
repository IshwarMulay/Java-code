// Java program to check voting eligibility based on age using ternary operator

class VotingCriteria
{
    public static void main(String[] args)
    {
        int ResultAge = 21;

        // Using a ternary operator to check if the age meets the voting eligibility criteria
        String result = ResultAge >= 18 ? "Congrats you can vote" : "Sorry You are not Eligible";

        System.out.println(result);
    }
}

/* Output:
   Compile time: Success
   Run time: Congrats you can vote
*/
