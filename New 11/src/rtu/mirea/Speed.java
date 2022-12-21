package rtu.mirea;

import java.util.*;
import java.text.*;

public class Speed {
    private long startTime, Time;

    Speed() {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> larray = new LinkedList<>();
        for (int i = 0; i < 1000; i++)
            array.add(i);
        for (int i = 0; i < 1000; i++)
            larray.add(i);

        System.out.println("ArrayList: ");
        startTime = System.nanoTime();
        array.add(12);
        Time = System.nanoTime() - startTime;
        System.out.println("Speed of add: " + Time);
        startTime = System.nanoTime();
        array.remove(0);
        Time = System.nanoTime() - startTime;
        System.out.println("Speed of remove: " + Time);
        startTime = System.nanoTime();
        array.indexOf(14);
        Time = System.nanoTime() - startTime;
        System.out.println("Speed of Search: " + Time);

        System.out.println("LinkedList: ");
        startTime = System.nanoTime();
        larray.add(12);
        Time = System.nanoTime() - startTime;
        System.out.println("Speed of add: " + Time);
        startTime = System.nanoTime();
        larray.remove(0);
        Time = System.nanoTime() - startTime;
        System.out.println("Speed of remove: " + Time);
        startTime = System.currentTimeMillis();
        larray.indexOf(14);
        Time = System.nanoTime() - startTime;
        System.out.println("Speed of Search: " + Time);
    }
}
