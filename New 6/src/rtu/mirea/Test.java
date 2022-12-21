package rtu.mirea;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(1, 6, 1, 2);
        System.out.println(movableRectangle.SpeedTest());

        MovableCircle movableCircle = new MovableCircle(12, 13, 1, 1, 5);
        movableCircle.toString();
        movableCircle.moveDown(12);
        movableCircle.moveLeft(25);
        movableCircle.toString();

        Book book = new Book("Harry Potter");
        book.Print();

        Shop shop = new Shop("Victoria Secrets");
        shop.Print();

        Printable[] array = new Book[3];
        Book book1 = new Book("The last son");
        array[0] = book1;
        Book book2 = new Book("Home alone");
        array[1] = book2;
        Book book3 = new Book("Resident evil");
        array[2] = book2;
        for (int i = 0; i < 3; i++)
            array[i].Print();
        Scanner in = new Scanner(System.in);
        ComShop comShop = new ComShop(in.nextInt());
        comShop.Print();
        comShop.Delete(1);
        comShop.Print();
        comShop.Add("SAMSUNG");
        comShop.Print();

        Temperature temperature = new Temperature(-40);
        temperature.convert("Kelvin");
        temperature.convert("Fahrenheit");

    }
}
