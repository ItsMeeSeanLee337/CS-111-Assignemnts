/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski 
{
    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) 
    {
        return (0.5 * Math.sqrt(3) * length);
    }
    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) 
    {
        double bottomX = x;
        double bottomY = y;
        double leftX = (x - (0.5 * length));
        double rightX = (x + (0.5 * length));
        double leftRightY = y + height(length);
        double[] xCoordinates = {bottomX, leftX, rightX};
        double[] yCoordinates = {bottomY, leftRightY, leftRightY};
        StdDraw.filledPolygon(xCoordinates, yCoordinates);
    }
    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) 
    {
        if (n == 0)
        {
            return;
        }
        else
        {
            //center
            filledTriangle(x, y, length);
            //left
            sierpinski(n - 1, x - (length / 2), y, length / 2);
            //right
            sierpinski(n - 1, x + (length / 2), y, length / 2);
            //top
            sierpinski(n - 1, x , y + height(length), length / 2);
        }
    }
    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) 
    {
        double bottomLeftX = 0;
        double bottomLeftY = 0;
        double bottomRightX = 1;
        double bottomRightY = 0;
        double topX = 0.5;
        double topY = height(1);
        double[] xCoordinates = {bottomLeftX, bottomRightX, topX};
        double[] yCoordinates = {bottomLeftY, bottomRightY, topY};
        StdDraw.polygon(xCoordinates, yCoordinates);
        sierpinski(Integer.parseInt(args[0]), 0.5, 0.0, 0.5);
    }
}