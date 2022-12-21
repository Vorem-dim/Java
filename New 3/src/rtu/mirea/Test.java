package rtu.mirea;

public class Test {
    public static void main(String[] args) {
        Darray darray = new Darray();
        darray.Print();
        darray.Sort();
        darray.Print();

        int size = 10;
        Circle[] circles = new Circle[size];
        for (int i = 0; i < size; i++)
            circles[i] = new Circle();
        circles[0].Find_smallest(circles, size);
        circles[0].Find_biggest(circles, size);
        circles[0].Print(circles, size);
        circles[0].Sort(circles, size);
        circles[0].Print(circles, size);

        Array array1 = new Array(10);
        array1.Print();
        System.out.println(array1.Grow());

        Array array2 = new Array(0);
        array2.Print();
        array2.Even_Array();
        array2.Print_even();

        double d1 = Double.valueOf(12.5), d2 = Double.valueOf(34);
        System.out.println(d1 + "\n" + d2);

        Report[] arr = new Report[5];
        for (int i = 0; i < 5; i++)
            arr[i] = new Report();
        for (int i = 0; i < 5; i++)
            arr[i].generateReport();
    }
}