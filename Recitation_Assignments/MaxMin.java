public class MaxMin 
{
    public static void main(String[] args) 
    {
        // first value read initializes min and max
        int num1 = StdIn.readInt();
        // read in the data, keep track of min and max
        int min = 0;
        int max = 0;
        while (!StdIn.isEmpty())
        {
            if (num1 >= max)
            {
                max = num1;
            }
            if (num1 <= max)
            {
                min = num1;
            }
            num1 = StdIn.readInt();
        }
        // output
        StdOut.println("max = " + max + "   min = " + min);
    }
}