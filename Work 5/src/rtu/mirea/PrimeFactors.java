package rtu.mirea;
import java.util.Scanner;

public class PrimeFactors {
    private int num, k = 2;
    PrimeFactors() {
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.print("Prime factors of number " + num + ": ");
        Factors(num, k);
    }
    private void Factors(int num, int k) {
        if (k > num / 2) {
            System.out.println(num);
            return;
        }
        if (num % k == 0) {
            System.out.print(k + ", ");
            Factors(num / k, k);
        }
        else
            Factors(num, ++k);
    }
}
