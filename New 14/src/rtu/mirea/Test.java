package rtu.mirea;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Reg reg = new Reg();
        //reg.Check(in.nextLine());
        reg.Check_price(in.nextLine());
        //reg.Check_ex(in.nextLine());
        reg.Check_email(in.nextLine());
        //reg.Check_password(in.nextLine());
    }
}
