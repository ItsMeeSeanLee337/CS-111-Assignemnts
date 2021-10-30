public class PizzaCalculator
{
    public static void main(final String[] args) 
    {
        final double length = Double.parseDouble(args[0]);
        final double area = Math.pow(length, 2) * Math.PI;
        System.out.println((int)(area/100));
    }
}