public class BasicVoltageReading {

    public static void main(String[] args) {

        int analogValue = 512; // Example input (0-1023)
        double voltage = analogValue * (5.0 / 1023.0);

        System.out.println("Voltage Generated: " + voltage + " V");
    }
}
