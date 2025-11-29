import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = sc.nextDouble();

        
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        
        System.out.print("Enter attitude score (1–10): ");
        int attitude = sc.nextInt();

        
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("✅ Student is eligible for scholarship.");
                } else {
                    System.out.println("❌ Not eligible: Attitude score too high.");
                }
            } else {
                System.out.println("❌ Not eligible: Attendance below 80%.");
            }
        } else {
            System.out.println("❌ Not eligible: GPA below 3.2.");
        }
    }
}
