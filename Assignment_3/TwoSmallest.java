/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest 
{
    public static void main(String[] args) 
    {
        double smallest = Double.MAX_VALUE;
        double secondSmallest = Double.MAX_VALUE;
        for (int i = 0; i < args.length; i++)
        {
            if (Double.parseDouble(args[i]) <= smallest)
            {
                secondSmallest = smallest;
                smallest = Double.parseDouble(args[i]);
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }

}
