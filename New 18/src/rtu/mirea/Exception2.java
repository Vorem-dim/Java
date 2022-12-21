package rtu.mirea;

import java.util.Scanner;

public class Exception2 {
    public void ExceptionDemo() {
        Scanner in = new Scanner( System.in);
        System.out.print( "Enter an integer: ");
        String str = in.nextLine();
        try {
            int number = Integer.parseInt(str);
            System.out.println(2 / number);
        }
        //catch (NumberFormatException e) {
          //  System.out.println("Number format error");
        //}
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Finish");
        }
    }
}
