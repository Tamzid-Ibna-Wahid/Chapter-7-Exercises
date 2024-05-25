package E7_15;

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

    public Sequence sum(Sequence other)
    {
        int aLen = size();
        int bLen = other.size();
        int largerLen = Math.max(aLen, bLen);

        Sequence result = new Sequence(largerLen);

        for (int i = 0; i < largerLen; i++)
        {
            if (i < aLen && i < bLen)
            {
                result.set(i, get(i) + other.get(i));
            }
            else if(i < aLen)
            {
                result.set(i, get(i));
            }
            else
            {
                result.set(i, other.get(i));
            }
        }

        return result;
    }
}

