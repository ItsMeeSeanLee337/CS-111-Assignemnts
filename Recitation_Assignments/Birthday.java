public class Birthday 
{
    public static void main(String[] args) 
    {
        // this variable keeps track of the number of people we've asked so far
        int numPeople = 0;
        // this array will associate true or false with each possible birthday
        boolean[] seenBefore = new boolean[365];
        int dayOfBirth = 0;
        while (true) 
        {
            dayOfBirth = (int)(Math.random() * (365 - 0));
            // ask a person - so increment counter
            numPeople++;
            // represented as an int between 0 and 364
            if (seenBefore[dayOfBirth] == true) 
            {
                break;
            }
            else
            {
                seenBefore[dayOfBirth] = true;
            }
            // if we've seen this dayNum in a previous iteration,
            // leave the loop immediately
            // update seenBefore[], for future iterations of this loop
        } 
        // so, how many people did you need to find two with the same birthday?
        System.out.println(numPeople);
    }
}

