package rtu.mirea;

import java.util.Scanner;

public class ComShop {
    private Computer[] array;
    private int size;
    private Scanner in = new Scanner(System.in);

    public ComShop(int size) {
        this.size = size;
        array = new Computer[size];
        for (int i = 0; i < size; i++)
            array[i] = new Computer(in.nextLine());
    }

    public void Delete(int ind) {
        ind--;
        int flag = 0;
        Computer[] temp = new Computer[size-1];
        for (int i = 0; i < size; i++) {
            if (i != ind)
                temp[i - flag] = array[i];
            else
                flag = 1;
        }
        size--;
        array = new Computer[size];
        for (int i = 0; i < size; i++)
            array[i] = temp[i];
    }

    public void Add(String mark) {
        Computer[] temp = new Computer[size];
        for (int i = 0; i < size; i++)
            temp[i] = array[i];
        size++;
        array = new Computer[size];
        for (int i = 0; i < size - 1; i++)
            array[i] = temp[i];
        array[size-1] = new Computer(mark);
    }

    public void Print() {
        for (int i = 0; i < size; i++)
            System.out.println(array[i].toString());
    }
}
