package rtu.mirea;

import java.util.Scanner;

public class Employee {
    String fullname;
    double salary;

    public Employee() {
        Scanner in = new Scanner(System.in);
        fullname = in.nextLine();
        salary = in.nextDouble();
    }
}