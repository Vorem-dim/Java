package rtu.mirea;

public class Test {
    public static void main(String[] args) {
    

        MathCalculable mathFunc = new MathFunc();
        System.out.println(mathFunc.pow(2, 6));
        System.out.println(mathFunc.abs_compl(12, 23));
        System.out.println(mathFunc.circle_len(12));
        System.out.println(mathFunc.circle_square(7));

        Stringable my_string = new My_string();
        System.out.println(my_string.Count("qazwsxedc"));
        System.out.println(my_string.uneven_str("qazwsxedc"));
        System.out.println(my_string.reverse("Hello"));
    }
}