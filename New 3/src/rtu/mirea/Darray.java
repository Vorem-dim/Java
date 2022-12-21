package rtu.mirea;

import java.util.Scanner;

public class Darray {
    private double[] array;
    private int n;
    Darray() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = (double)(Math.random() * 100);
    }
    public void Sort() {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (array[min] > array[j])
                    min = j;
            double temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
    public void Print() {
        for (int i = 0; i < n; i++)
            System.out.print(String.format("%.5f",array[i]) + " ");
        System.out.println();
    }
}
