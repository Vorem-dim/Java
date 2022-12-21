package rtu.mirea;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Speed speed = new Speed();

        Work work1 = new Work("Maximus");
        System.out.println(work1);

        Work work2 = new Work("Romanov", in.nextLong());
        if (work2.Compare() == 1)
            System.out.println("The date is less");
        else if (work2.Compare() == -1)
            System.out.println("The date is more");
        else
            System.out.println("The dates are the same");

        Work work3 = new Work("Pavlov", in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), 30);
        System.out.println(work3.get_calendar());
    }
}
