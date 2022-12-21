package rtu.mirea;

public class Circle extends Point{
    private double length;
    private int radius;
    public Circle() {
        super();
        radius = (int)(Math.random()*21);
        length = 2 * 3.14 * radius;
    }
    public void Find_smallest(Circle[] array, int size) {
        int min = 0;
        for (int i = 1; i < size; i++)
            if (array[min].radius > array[i].radius)
                min = i;
        System.out.println("The smallest circle has radius - " + array[min].radius + " and length - " + array[min].length);
    }
    public void Find_biggest(Circle[] array, int size) {
        int max = 0;
        for (int i = 1; i < size; i++)
            if (array[max].radius < array[i].radius)
                max = i;
        System.out.println("The biggest circle has radius - " + array[max].radius + " and length - " + array[max].length);
    }
    public void Sort(Circle[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++)
                if (array[min].radius > array[j].radius)
                    min = j;
            Circle temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
    public void Print(Circle[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.println("Radius - " + array[i].radius + " and length " + array[i].length);
        System.out.println();
    }
}
