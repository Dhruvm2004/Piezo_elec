public class PeakVoltageDetection {

    public static void main(String[] args) {

        int[] readings = {50, 120, 300, 250, 400, 200};
        int peak = readings[0];

        for (int val : readings) {
            if (val > peak) {
                peak = val;
            }
        }

        double peakVoltage = peak * (5.0 / 1023.0);

        System.out.println("Peak Voltage: " + peakVoltage + " V");
    }
}
