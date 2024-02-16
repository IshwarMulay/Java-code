//Java program to find the last digit of a given number.



class LastDigitOfNumber
{
    
    public static void main(String[] ldon)
    {
        
        int number = 1256784;

        // Using the modulo operator (%) to find the last digit of the number
        // The result is the remainder when dividing the number by 10
        int lastDigit = number % 10;

      
        System.out.println(lastDigit);
    }
}


/*Output:
 Compile time: Success
 Run time: 4
*/