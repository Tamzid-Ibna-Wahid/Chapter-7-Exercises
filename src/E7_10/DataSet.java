package E7_10;

public class DataSet {
    private double[] values;
    private int currentSize;

    public DataSet(int maximumNumberOfValues) {
        values = new double[maximumNumberOfValues];
        currentSize = 0;
    }

    public void add(double value) {
        if (currentSize < values.length) {
            values[currentSize] = value;
            currentSize++;
        }
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += values[i];
        }
        return sum;
    }

    public double getAverage() {
        if (currentSize == 0) {
            return 0;
        }
        return getSum() / currentSize;
    }

    public double getMax() {

        double max = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public double getMin() {

        double min = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }
}

