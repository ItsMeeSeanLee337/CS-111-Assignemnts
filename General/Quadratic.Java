public class Quadratic
{
    public static void main(String [] args)
    {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        if ((Math.pow(b, 2) - 4.0 * c) < 0)
        {
            System.out.println("There are no roots.");
        }
        else if (((Math.pow(b, 2) - 4.0 * c) == 0))
        {
            System.out.println((-b/2) + ": both roots have this value.");
        }
        else
        {
            System.out.print((-b - Math.sqrt((Math.pow(b, 2) - 4.0 * c)) / 2) + " " + ((-b + Math.sqrt((Math.pow(b, 2) - 4.0 * c)) / 2)));
        }
    }
}