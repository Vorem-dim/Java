package rtu.mirea;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student_date = new Student(in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println(student_date);

        Student student = new Student(in.nextInt());
        student.SelectionSort();

        Group group1 = new Group(in.nextInt());
        group1.QuickSort(0, group1.getSize() - 1);
        group1.Print();

        Group group2 = new Group(in.nextInt());

        Group group3 = new Group();
        group3.MergeSort(group1, group2);
        group3.Print();
    }
}
