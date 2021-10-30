/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes 
{
	public static void main(String[] args) 
	{
		int reviewers = Integer.parseInt(args[0]);
		int movies = Integer.parseInt(args[1]);
		int[][] movieRatings = new int[reviewers][movies];
		int reviewNumber = 1;
		int largestSum = 0;
		int tempSum = 0;
		int largestReview = 0;
		for (int i = 0; i < reviewers; i++)
		{
			for (int j = 0; j < movies; j++)
			{
				movieRatings[i][j]= Integer.parseInt(args[1 + reviewNumber]);
				reviewNumber++;
			}
		}
		for (int i = 0; i < movies; i++)
		{
			for (int j = 0; j < reviewers; j++)
			{
				tempSum+= movieRatings[j][i];
			}
			if (tempSum >= largestSum)
			{
				largestSum = tempSum;
				largestReview = i;
			}
			tempSum = 0;
		}
		System.out.println(largestReview);
	}
}
