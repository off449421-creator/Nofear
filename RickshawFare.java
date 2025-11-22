import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        final int BASE_FARE = 50;    
        final int PER_KM = 20;         
        final int PER_MIN = 2;         

        
        System.out.print("Enter distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Enter time (minutes): ");
        int time = sc.nextInt();

        System.out.print("Is the customer local? (yes/no): ");
        boolean isLocal = sc.next().equalsIgnoreCase("yes");

        System.out.print("Is it night travel? (yes/no): ");
        boolean isNight = sc.next().equalsIgnoreCase("yes");

        
        double fare = BASE_FARE + (distance * PER_KM) + (time * PER_MIN);

        
        fare = (isLocal && distance > 10) ? fare * 0.9 : fare;

        
        fare = isNight ? fare * 1.2 : fare;

        
        System.out.println("Rs. " + Math.round(fare));
    }
}




       
    

