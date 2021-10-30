public class Div 
{
    public static void main (String[] args)
    {
        int[] a = new int[6]; 
        a[0] = 0; a[1] = 1; 
        int x = 0;
        for (int i = 2; i < 6; i++) 
        { 

            a[i] = a[i - 1] + ((3 * (i-1) * (i-1)) + (3 * i - 2));
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
