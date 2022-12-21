package rtu.mirea;

import java.util.Scanner;

public class Group {
    private int size;
    private Student[] students;

    public Group() {}

    public Group(int size) {
        this.size = size;
        students = new Student[size];
        for (int i = 0; i < size; i++) {
            Scanner in = new Scanner(System.in);
            Student student_x = new Student(in.nextLine(), in.nextLine(), in.nextLine());
            students[i] = student_x;
        }
    }
    public void QuickSort(int start, int end) {
        int i = start, j = end;
        Student student = students[(start + end) / 2];
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        do {
            while (sortingStudentsByGPA.compare(students[i], student) > 0)
                i++;
            while (sortingStudentsByGPA.compare(students[j], student) < 0)
                j--;
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (j > start)
            QuickSort(start, j);
        if (i < end)
            QuickSort(i, end);
    }

    public void MergeSort(Group group1, Group group2) {
        size = group1.size + group2.size;
        students = new Student[size];
        for (int i = 0; i < size; i++) {
            if (i < group1.size)
                students[i] = group1.students[i];
            else
                students[i] = group2.students[i - group1.size];
        }
        Sort(0, size - 1);
    }

    private void Sort(int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            Sort(start, middle);
            Sort(middle + 1, end);
            Merge(start, end, middle);
        }
    }

    private void Merge(int start, int end, int middle) {
        int i = start, j = middle + 1, count = start;
        Group temp = new Group();
        temp.students = new Student[end + 1];
        while (i <= middle && j <= end) {
            if (students[i].getMark() < students[j].getMark()) {
                temp.students[count] = students[i];
                count++;
                i++;
            }
            else {
                temp.students[count] = students[j];
                count++;
                j++;
            }
        }
        while (i <= middle) {
            temp.students[count] = students[i];
            count++;
            i++;
        }
        while (j <= end) {
            temp.students[count] = students[j];
            count++;
            j++;
        }
        for (i = start; i < count; i++)
            students[i] = temp.students[i];
    }

    public int getSize() {
        return size;
    }

    public void Print() {
        for (int i = 0; i < students.length; i++)
            System.out.println(students[i].getName() + " " + students[i].getSurname() + " " + students[i].getSpeciality() + " " + students[i].getGroup() + " " + students[i].getCourse() + " " + students[i].getMark());
    }
}
