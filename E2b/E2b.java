public class E2b 
{
    public static void main (String[] args)
    {
        int sizeOfArray = StdIn.readInt();
        int[][] twoIntArr = new int[sizeOfArray][sizeOfArray];
        int[][] newTwoIntArr = new int[sizeOfArray][sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++)
        {
            for (int j = 0; j < sizeOfArray; j++)
            {
                twoIntArr[i][j] =  StdIn.readInt();
            }
        }
        for (int i = 0; i < sizeOfArray; i++)
        {
            for (int j = 0; j < sizeOfArray; j++)
            {
                newTwoIntArr[i][j] = twoIntArr[sizeOfArray - (1 + j)][sizeOfArray - (1 + i)];
                System.out.print(newTwoIntArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
