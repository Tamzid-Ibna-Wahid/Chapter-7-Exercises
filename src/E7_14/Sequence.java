package E7_14;


public class Sequence
{
    private int[] values;

    public Sequence(int size)
    {
        values = new int[size];
    }
    public void set(int i, int n)
    {
        values[i] = n;
    }

    public int get(int i)
    {
        return values[i];
    }
    public int size()
    {
        return values.length;
    }


    public boolean isPermutationOf(Sequence other)
    {
        if (values.length != other.values.length)
            return false;

        boolean[] thisCheck = new boolean[values.length];
        boolean[] otherCheck = new boolean[other.values.length];

        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; (j < other.values.length) && !thisCheck[i]; j++)
            {
                if (!otherCheck[j] && values[i] == other.values[j])
                {
                    thisCheck[i] = true;
                    otherCheck[j] = true;
                }
            }
        }
        for (int i = 0; i < thisCheck.length; i++)
        {
            if (!thisCheck[i])
                return false;
            if (!otherCheck[i])
                return false;
        }
        return true;
    }
}

