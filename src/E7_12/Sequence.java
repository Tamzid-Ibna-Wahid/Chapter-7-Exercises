package E7_12;

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

    public boolean equals(Sequence other)
    {
        if (values.length != other.values.length)
        {
            return false;
        }
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] != other.values[i])
            {
                return false;
            }
        }
        return true;
    }
}
