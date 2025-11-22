import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        // Using Ternary Operator
        String result = (grade >= 40) ? "Pass" : "Fail";

        // Output with escape sequences
        System.out.println("\n\t--- Grade Evaluation ---");
        System.out.println("\tYour Grade: " + grade);
        System.out.println("\tResult: " + result);
    }
}

