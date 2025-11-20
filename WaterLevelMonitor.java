public class WaterLevelMonitor {
    public static void main(String[] args) {
        // Initialize the water level (sample data)
        int waterLevel = 1000; // You can change it to 950, 1200, etc.

        // Display the current water level
        System.out.println("Current Water Level: " + waterLevel + "L");

        // Use ternary operator to check water level status
        String message = (waterLevel >= 1000)
                ? "WARNING: Water level has reached 1000L or more!"
                : "Status: Normal";

        // Display the message
        System.out.println(message);
    }
}
