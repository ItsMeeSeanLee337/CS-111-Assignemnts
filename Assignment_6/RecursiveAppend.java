/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend 
{

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) 
    {
        if (n >= 1)
        {
            //StdOut.print(original);
            return appendNTimes(original, n - 1);
        }
        //StdOut.print(original);
        return original;
    }

    public static void main (String[] args) 
    {
        String cat = "cat";
        appendNTimes(cat, Integer.parseInt(args[0]));
    }
}
