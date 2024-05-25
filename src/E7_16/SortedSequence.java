package E7_16;

import java.util.Arrays;
import java.util.Random;

public class SortedSequence
{

    public int[] generateRandom(int n)
    {
        int[] tosses = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++)
        {
            tosses[i] = generator.nextInt(100);
        }
        return tosses;
    }


    public void printArray(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        SortedSequence sortedarray = new SortedSequence();

        int[] values = sortedarray.generateRandom(20);
        sortedarray.printArray(values);
        Arrays.sort(values);
        sortedarray.printArray(values);
    }
}
