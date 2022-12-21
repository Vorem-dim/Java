package rtu.mirea;

import java.util.Arrays;

public class Address {
    private String[] address;

    Address(String str) {
        address = str.split("[;,:]");
    }

    @Override
    public String toString() {
        return "Country: " + address[0] + "\nRegion: " + address[1] + "\nCity: " + address[2] + "\nStreet: " + address[3] + "\nBuilding: " + address[4] + "\nCorpus: " + address[5] + "\nFlat: " + address[6];
    }
}
