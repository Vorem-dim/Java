package rtu.mirea;

public class Array {
    private int size;
    private int[] array;
    public Array(int size) {
        this.size = size;
        array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = (int)((Math.random() * 101) - 50);
    }
    public void Sort() {
        for (int i = 0; i < size - 1; i++)
            for (int j = i + 1; j < size; j++)
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    }
    public void Print() {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.print("\n");
    }
}
