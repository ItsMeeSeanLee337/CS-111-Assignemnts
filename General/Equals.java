public class Equals 
{
    public static void main(String [] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        boolean check = ((num1 == num2) && (num2 == num3));
        System.out.println(check);
    }  
}
