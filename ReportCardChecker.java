// october 21, 2026
import java.util.Scanner;

public class ReportCardChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int gradeOne = input.nextInt();
        int gradeTwo = input.nextInt();
        int gradeThree = input.nextInt();
        int gradeFour = input.nextInt();
        
        double average = (double) (gradeOne + gradeTwo + gradeThree + gradeFour) / 4;
        
        System.out.println("Name: " + name);
        System.out.printf("Average: %.2f%n", average);
        
        if (average >= 90) {
            System.out.println("Descriptor: Outstanding");
        } else if (average >= 85) {
            System.out.println("Descriptor: Very Satisfactory");
        } else if (average >= 80) {
            System.out.println("Descriptor: Satisfactory");
        } else if (average >= 75) {
            System.out.println("Descriptor: Fairly Satisfactory");
        } else if (average < 75) {
            System.out.println("Descriptor: Did Not Meet Expectations");
        }
        
        if (average >= 75) {
            System.out.println("Remarks: Passed");
        } else {
            System.out.println("Remarks: Failed");
        }
        
        if (average >= 98) {
            System.out.println("Honor: With Highest Honors");
        } else if (average >= 95) {
            System.out.println("Honor: With High Honors");
        } else if (average >= 90) {
            System.out.println("Honor: With Honors");
        } else if (average < 90) {
            System.out.println("Honor: None");
        }
    }
}
