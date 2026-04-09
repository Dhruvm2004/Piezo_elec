public class ThresholdDetection {

    public static void main(String[] args) {

        int analogValue = 120; // Example input
        int threshold = 100;

        if (analogValue > threshold) {
            System.out.println("Energy Sufficient -> LED ON");
        } else {
            System.out.println("Low Energy -> LED OFF");
        }
    }
}
