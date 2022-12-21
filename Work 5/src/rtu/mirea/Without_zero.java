package rtu.mirea;

import java.util.Scanner;

public class Without_zero {
    private int num0, num1, count;
    Without_zero() {
        Scanner in = new Scanner(System.in);
        int num0 = in.nextInt();
        int num1 = in.nextInt();
        count = Sequence(num0, num1);
        System.out.println(count + " sequences");
    }
    private int Sequence(int num0, int num1) {
        if (num0 > num1 + 1)
            return 0;
        if (num0 == 0 || num1 == 0)
            return 1;
        return Sequence(num0, num1 - 1) + Sequence(num0 - 1, num1 - 1);
    }
}
