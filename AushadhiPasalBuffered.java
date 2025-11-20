import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AushadhiPasalBuffered {
    public static void main(String[] args) {
        try {
            // Create BufferedReader object for user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("=== Aushadhi Pasal Inventory System ===");

            // Medicine 1
            System.out.print("Enter Medicine Name: ");
            String medName = reader.readLine().trim(); // trim() removes extra spaces

            System.out.print("Enter Price (NPR): ");
            double price = Double.parseDouble(reader.readLine().trim());

            System.out.print("Enter Stock Quantity: ");
            int stock = Integer.parseInt(reader.readLine().trim());

            System.out.print("Does it require a prescription? (yes/no): ");
            String presInput = reader.readLine().trim();
            boolean prescription = presInput.equalsIgnoreCase("yes");
            // Display formatted report
            System.out.println("\n=============================================");
            System.out.println("\tAUSHADHI PASAL - INVENTORY REPORT");
            System.out.println("=============================================");
            System.out.println("Medicine Name\tPrice (NPR)\tStock\tPrescription Required");
            System.out.println("---------------------------------------------");
            System.out.println(medName + "\t\t" + price + "\t\t" + stock + "\t" + (prescription ? "Yes" : "No"));
            System.out.println("=============================================");
            System.out.println("\tEnd of Inventory Report");
            System.out.println("=============================================");

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values for price and stock.");
        }
    }
}
