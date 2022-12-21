package rtu.mirea;

public class Report extends Employee {
    public void generateReport() {
        System.out.println(fullname + " " + String.format("%10.2f", salary));
    }
}
