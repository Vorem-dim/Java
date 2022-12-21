package rtu.mirea;

public class Rec {
    public void Triangle_array(int n) {
        if (n < 1)
            return;
        else if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        else {
            Triangle_array(n - 1);
            for (int i = 0; i < n; i++)
                System.out.print(n + " ");
        }
    }
    public void Fact_rev(int end, int beg) {
        if (end < beg)
            return;
        else if (end == beg) {
            System.out.print(beg + " ");
            return;
        }
        else {
            Fact_rev(end - 1, beg);
            System.out.print(end + " ");
        }
    }
    public void A_to_B (int a, int b) {
        if (a > b)
            Fact_rev(a, b);
        else if (b > a)
            Fact_rev(b, a);
    }
}
