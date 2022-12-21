package rtu.mirea;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Address address = new Address("Russia; Moscow region, Ramenskoe: Rublevskaya, 9; 4A; 314");
        System.out.println(address);

        Telephone telephone = new Telephone("89776038323");

        What  what = new What(in.nextLine());
    }
}
