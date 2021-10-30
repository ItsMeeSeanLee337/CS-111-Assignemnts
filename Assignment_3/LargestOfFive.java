/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive 
{
    public static void main (String[] args) 
    {
        int[] numArray = new int[5];
        int largest = 0;
        for (int i = 0; i < 5; i++)
        {
            numArray[i] = Integer.parseInt(args[i]);
        }
        for (int number : numArray)
        {
            if (number >= largest)
            {
                largest = number;
            }
        }
        System.out.println(largest);
    }
}