package E7_17;

public class Table
{
    private int[][] values;

    public Table(int rows, int columns)
    {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n)
    {
        values[i][j] = n;
    }

    public double neighborAverage(int row, int column)
    {
        double sum = 0;
        int count = 0;

        final int ROWS = values.length;
        final int COLS = values[0].length;


        for (int dx = -1; dx <= 1; dx++)
        {
            for (int dy = -1; dy <= 1; dy++)
            {
                if (dx != 0 || dy != 0)
                {
                    int c = column + dx;
                    int r = row + dy;
                    if (c >= 0 && c < COLS && r >= 0 && r < ROWS)
                    {
                        sum += values[r][c];
                        count++;
                    }
                }
            }
        }

        if (count > 0)
            return sum / count;
        return 0;
    }
}

