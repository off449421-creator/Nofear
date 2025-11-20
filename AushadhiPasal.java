public class AushadhiPasal {
    public static void main(String[] args) {

        // Medicine information
        String med1 = "Paracetamol";
        double price1 = 1.5;
        int stock1 = 100;
        boolean prescription1 = false;

        String med2 = "Amoxicillin";
        double price2 = 5.0;
        int stock2 = 50;
        boolean prescription2 = true;

        String med3 = "Cetirizine";
        double price3 = 3.0;
        int stock3 = 80;
        boolean prescription3 = false;

        // Header
        System.out.println("=============================================");
        System.out.println("\t   AUSHADHI PASAL - INVENTORY REPORT");
        System.out.println("=============================================");
        System.out.println("Medicine Name\tPrice (NPR)\tStock\tPrescription Required");
        System.out.println("---------------------------------------------");

        // Display medicine details
        System.out.println(med1 + "\t\t" + price1 + "\t\t" + stock1 + "\t" + (prescription1 ? "Yes" : "No"));
        System.out.println(med2 + "\t\t" + price2 + "\t\t" + stock2 + "\t" + (prescription2 ? "Yes" : "No"));
        System.out.println(med3 + "\t\t" + price3 + "\t\t" + stock3 + "\t" + (prescription3 ? "Yes" : "No"));

        // Footer
        System.out.println("=============================================");
        System.out.println("\tEnd of Inventory Report");
        System.out.println("=============================================");
    }
}
