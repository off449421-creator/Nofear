import java.util.Scanner;

public class SellingPriceSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the marked price of the item: ");
        float mp = sc.nextFloat();

        
        System.out.print("Enter the category (A/B/C/D): ");
        char category = sc.next().charAt(0);

        float discount = 0.0f;  
        float sp;               

        
        switch (Character.toUpperCase(category)) {
            case 'A':
                discount = 0.60f; 
                break;
            case 'B':
                discount = 0.40f; 
                break;
            case 'C':
                discount = 0.20f; 
                break;
            case 'D':
                discount = 0.10f; 
                break;
            default:
                System.out.println("Invalid category entered!");
                return; 
        }

        
        sp = mp - (mp * discount);

        
        System.out.println("Selling Price = " + sp);
    }
}
