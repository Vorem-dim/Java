package rtu.mirea;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        Array array = new Array(size);
        array.Print();
        array.Sort();
        array.Print();
    }
}
