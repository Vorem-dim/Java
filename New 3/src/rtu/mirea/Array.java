package rtu.mirea;

import java.util.Scanner;
import java.util.Random;
public class Array {
    private Scanner in = new Scanner(System.in);
    private int[] array, even_array;
    private int n, even_n = 0;
    Array(int line) {
        n = in.nextInt();
        while (n <= 0)
            n = in.nextInt();
        array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            array[i] = rand.nextInt(90) + line;
    }
    public void Even_Array() {
        for (int i = 0; i < n; i++)
            if (array[i] % 2 == 0)
                even_n++;
        if (even_n == 0)
            return;
        even_array = new int[even_n];
        int j = 0;
        for (int i = 0; i < n; i++)
            if (array[i] % 2 == 0) {
                even_array[j] = array[i];
                j++;
            }
    }
    public String Grow() {
        for (int i = 1; i < n; i++)
            if (array[i] <= array[i - 1])
                return "Array isn't growing";
        return "Array is growing";
    }
    public void Print() {
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public void Print_even() {
        for (int i = 0; i < even_n; i++)
            System.out.print(even_array[i] + " ");
        System.out.println();
    }
}