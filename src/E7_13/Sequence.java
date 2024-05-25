package E7_13;


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

    public boolean sameValues(Sequence other)
    {
        for (int i = 0; i < size(); i++)
        {
            boolean found = false;
            int value = get(i);
            for (int j = 0; j < other.size() && ! found; j++)
            {
                if (other.get(j) == value)
                {
                    found = true;
                }
            }
            if (! found)
            {
                return false;
            }
        }

        for (int i = 0; i < other.size(); i++)
        {
            boolean found = false;
            int value = other.get(i);
            for (int j = 0; j < size() && ! found; j++)
            {
                if (get(j) == value)
                {
                    found = true;
                }
            }
            if (! found)
            {
                return false;
            }
        }

        return true;
    }
}

