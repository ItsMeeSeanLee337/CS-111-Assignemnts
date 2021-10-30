/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker 
{
    public static void main(String[] args) 
    {
	    int numberOfWalks = Integer.parseInt(args[0]);
		int[] position = {0, 0};
		double positiveOrNegative = 0;
		int direction = 0;
		double xOrY = 0;
		System.out.println("(" + position[0] + "," + position[1] + ")");
		for (int i = 0; i < numberOfWalks; i++)
		{
			positiveOrNegative = Math.random();
			if (positiveOrNegative <= 0.5)
			{
				direction = -1;
			}
			else
			{
				direction = 1;
			}
			xOrY = Math.random();
			if (xOrY <= 0.5)
			{
				position[0] += direction;
			}
			else
			{
				position[1] += direction;
			}
			System.out.println("(" + position[0] + "," + position[1] + ")");
		}
		int squaredDistance = ((position[0] * position[0]) + (position[1] * position[1]));
		System.out.println("Squared distance = " + squaredDistance);
    }
}
