// november 11, 2026 | BIG task
import java.util.Scanner;

public class ClassRecollectionFund{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberStudents = input.nextInt();
        
        String status = "";
        final double FEE = 350;
        int fullyPaid = 0;
        int partial = 0;
        int unpaid = 0;
        
        double total = 0;
        for (int number = 1; number <= numberStudents; number++){
            double amountPaid = input.nextDouble();
            
            if (amountPaid >= FEE){
                status = "Fully Paid";
                fullyPaid++;
                System.out.print("Student " + number + ":");
                System.out.printf(" P%.2f %s%n" , amountPaid, status);
            } else if (amountPaid > 0){
                status = "Partial";
                partial++;
                System.out.print("Student " + number + ":");
                System.out.printf(" P%.2f %s%n" , amountPaid, status);
            } else if (amountPaid == 0){
                status = "Unpaid";
                unpaid++;
                System.out.print("Student " + number + ":");
                System.out.printf(" P%.2f %s%n" , amountPaid, status);
            } else if (amountPaid < 0){
                System.out.println("Student: " + number + ": Invalid amount");
                continue;
            }
            total += amountPaid;
        }
        
        System.out.println("Fully Paid: " + fullyPaid);
        System.out.println("Partial: " + partial);
        System.out.println("Unpaid: " + unpaid);
        
        double balance = (numberStudents * FEE) - total;
        
        System.out.printf("Total Collected: P%.2f%n", total);
        System.out.printf("Remaining Balance: P%.2f%n", balance);
        
    }
}
