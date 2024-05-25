package E7_18;


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

    
    public double sum(int i, boolean horizontal)
    {
        double sum = 0;

        final int ROWS = values.length;
        final int COLS = values[0].length;

        if (horizontal)
        {
            for (int col = 0; col < COLS; col++)
            {
                sum += values[i][col];
            }
        }
        else
        {
            for (int row = 0; row < ROWS; row++)
            {
                sum += values[row][i];
            }
        }

        return sum;
    }
}
