package E7_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] initialValues) {
        values =initialValues;
    }


    public void swapFirstAndLast() {
        if (values.length>1) {
            int temp =values[0];
            values[0] = values[values.length - 1];
            values[values.length -1] = temp;
        }
    }


    public void shiftRight() {
        if (values.length > 1) {
            int last =values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--) {
                values[i] = values[i - 1];
            }
            values[0] = last;
        }
    }


    public void replaceEvenWithZero() {
        for (int i = 0; i <values.length; i++) {
            if (values[i] %2 == 0) {
                values[i] = 0;
            }
        }
    }


    public void replaceWithLargerNeighbor() {
        if (values.length >2) {
            int[] newValues = Arrays.copyOf(values, values.length);
            for (int i = 1; i <values.length - 1; i++) {
                newValues[i] = Math.max(values[i - 1], values[i + 1]);
            }
            values = newValues;
        }
    }

    public void removeMiddle() {
        if (values.length ==0) return;
        int mid = values.length / 2;
        if (values.length % 2 ==0) {
            int[] newValues = new int[values.length - 2];
            System.arraycopy(values, 0, newValues, 0, mid - 1);
            System.arraycopy(values, mid + 1, newValues, mid - 1, values.length - mid - 1);
            values = newValues;
        } else {
            int[] newValues = new int[values.length - 1];
            System.arraycopy(values, 0, newValues, 0, mid);
            System.arraycopy(values, mid + 1, newValues, mid, values.length - mid - 1);
            values = newValues;
        }
    }

    public void moveEvensToFront() {
        int[] newValues = new int[values.length];
        int index = 0;
        for (int value :values) {
            if (value % 2 == 0) {
                newValues[index++] = value;
            }
        }
        for (int value : values) {
            if (value % 2 != 0) {
                newValues[index++] = value;
            }
        }
        values = newValues;
    }

    public int getSecondLargest() {
        if (values.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > largest) {
                secondLargest =largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                secondLargest = value;
            }
        }
        return secondLargest;
    }

    public boolean isSorted() {
        for (int i = 0; i <values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean hasAdjacentDuplicates() {
        for (int i =0; i <values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDuplicates() {
        Set<Integer> seen = new HashSet<>();
        for (int value :values) {
            if (seen.contains(value)) {
                return true;
            }
            seen.add(value);
        }
        return false;
    }

}

