package rtu.mirea;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String name, surname, speciality, group = "";
    private double mark;
    private int size, course;
    private int[] IDNumber;
    private Calendar calendar;

    public Student(int size) {
        this.size = size;
        IDNumber = new int[size];
        for (int i = 0; i < size; i++)
            IDNumber[i] = (int)((Math.random() * 201) - 100);
    }
    public Student(String name, String surname, String speciality) {
        calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, (int)((Math.random() * 30) + 1990));
        calendar.set(Calendar.MONTH, (int)(Math.random() * 12));
        calendar.set(Calendar.DAY_OF_MONTH, (int)(Math.random() * 28));
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        char[] temp = new char[6];
        temp[0] = (char)((Math.random() * 25) + 65);
        temp[1] = (char)((Math.random() * 25) + 65);
        temp[2] = (char)((Math.random() * 25) + 65);
        temp[3] = '-';
        temp[4] = (char)((Math.random() * 10) + 48);
        temp[5] = (char)((Math.random() * 10) + 48);
        for (int i = 0; i < 6; i++)
            group += temp[i];
        course = (int)(Math.random() * 3) + 1;
        mark = ((double)((int)(((double)((Math.random() * 3) + 2)) * 100)))/100;
    }

    public void SelectionSort() {
        Print();
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++)
                if (IDNumber[min] > IDNumber[j])
                    min = j;
            int temp = IDNumber[min];
            IDNumber[min] = IDNumber[i];
            IDNumber[i] = temp;
        }
        Print();
    }

    public double getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public int compareTo(Student student) {
        return student.name.compareTo(this.name);
    }

    private void Print() {
        for (int i = 0; i < size; i++)
            System.out.print(IDNumber[i] + " ");
        System.out.println("");
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        return name + " " + surname + " " + speciality + " " + group + " " + course + " " + mark + " Birthday: " + sdf.format(calendar.getTime());
    }
}
