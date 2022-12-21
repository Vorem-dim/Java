package rtu.mirea;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Template("Max", 12, false));

        Integer Iarray[] = {4, 5, 13, 9, 14};
        Double Darray[] = {2.5, 10.0, 13.2, 4.9, 6.7};
        MinMax Iminmax = new MinMax(Iarray);
        MinMax Dminmax = new MinMax(Darray);
        System.out.println(Iminmax.getMax());
        System.out.println(Iminmax.getMin());
        System.out.println(Dminmax.getMax());
        System.out.println(Dminmax.getMin());

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(12, 6));
        System.out.println(calculator.minus(54.8, 23.9));
        System.out.println(calculator.multi(23, 6));
        System.out.println(calculator.division(12.6, 5.2));
    }
}
