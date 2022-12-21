package rtu.mirea;

import java.util.Scanner;

public class Reverse {
    private int num;
    private String result;
    Reverse() {
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        result = NumRev(num);
        System.out.println("Reverse number: " + result);
    }
    private String NumRev(int num) {
        if (num / 10 == 0)
            return "" + num;
        else
            return (num % 10) + NumRev(num / 10);
    }
}
