/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/
public class CheckDigit 
{
    public static void main (String[] args) 
    {
        long originalNumber = Long.parseLong(args[0]);
        long digitCheck = originalNumber;
        long firstNumber = originalNumber;
        long secondNumber = originalNumber;
        int num1 = 0;
        int num2 = 0;
        num1 += (firstNumber % 10); //Every other digit from the right
        for (int i = 0; i < 6; i++)
        {
            firstNumber = (firstNumber/100);
            num1 += (firstNumber % 10);
        }
        num1 = (num1 % 10); //Discarding the tens digit            
        secondNumber = (secondNumber / 10); //Every other digit
        for (int i = 0; i < 5; i++)
        {
            num2 += (secondNumber % 10);
            secondNumber = (secondNumber/100);
        }
        num2 += (secondNumber % 10);
        num2 = (num2 % 10); //Discarding the tens digit
        num2 = (num2 * 3);
        num2 = (num2 % 10);
        System.out.println((num1 + num2) % 10);
    }
}