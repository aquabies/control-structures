// october 21, 2026 | if else
import java.util.Scanner;
public class PassOrFail{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int grade = input.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        
        if (grade >= 75) {
        System.out.println("Remarks: Passed");
        } else {
        System.out.println("Remarks: Failed");
        }
    }
}
