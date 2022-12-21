package rtu.mirea;

public class MathFunc implements MathCalculable{
    @Override
    public int pow(int num, int rank) {
        if (rank == 0)
            return 1;
        else if (rank >= 1) {
            int temp = num;
            for (int i = 1; i < rank; i++)
                temp *= num;
            return temp;
        }
        return -1;
    }

    @Override
    public int abs_compl(int real, int imagine) {
        return (int)Math.sqrt(real*real + imagine*imagine);
    }

    @Override
    public double circle_len(double radius) {
        return 2 * PI() * radius;
    }

    @Override
    public double circle_square(double radius) {
        return PI() * radius * radius;
    }

    @Override
    public double PI() {
        return 3.14;
    }
}
