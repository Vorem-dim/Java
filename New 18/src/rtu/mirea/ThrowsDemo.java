package rtu.mirea;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        printDetails(null);
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    public String getDetails(String key) throws Exception {
        if (key == null) {
            //throw new NullPointerException("null key in getDetails");
            throw new Exception("Null");
        }
        return "data for" + key;
    }
}
