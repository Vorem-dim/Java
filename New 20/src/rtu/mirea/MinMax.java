package rtu.mirea;

public class MinMax <Type extends Comparable> {
    private Type[] array;

    public MinMax(Type[] array) {
        this.array = array;
    }
    public Type getMin() {
        Type min = array[0];
        for (int i = 1; i < array.length; i++)
            if (min.compareTo(array[i]) > 0)
                min = array[i];
        return min;
    }
    public Type getMax() {
        Type max = array[0];
        for (int i = 1; i < array.length; i++)
            if (max.compareTo(array[i]) < 0)
                max = array[i];
        return max;
    }
}
