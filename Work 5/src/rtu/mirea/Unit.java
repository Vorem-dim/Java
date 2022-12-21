package rtu.mirea;

import java.util.Scanner;

public class Unit {
    private int count;
    Unit() {
         count = Num_of_unit();
         System.out.println(count + " of units");
    }
    private int Num_of_unit() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 == 1) {
            if (num2 == 1)
                return Num_of_unit() + num1 + num2;
            else {
                int num3 = in.nextInt();
                if (num3 == 1)
                    return Num_of_unit() + num1 + num2 + num3;
                else
                    return num1 + num2 + num3;
            }
        }
        else
            if (num2 == 1)
                return Num_of_unit() + num1 + num2;
            else
                return num1;
    }
}
