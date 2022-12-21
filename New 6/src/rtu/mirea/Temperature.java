package rtu.mirea;

public class Temperature implements Convertable {
    private float temperature;

    public Temperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void convert(String type) {
        if (type == "Kelvin")
            System.out.println("Temperature in Kelvin - " + (temperature + 273));
        else if (type == "Fahrenheit")
            System.out.println("Temperature in Fahrenheit - " + ((temperature * 9) / 5.0 + 32));
    }
}
