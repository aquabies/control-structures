import java.util.Scanner;

public class LibraryFineChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        char bookType = input.next().charAt(0);
        int daysOverdue = input.nextInt();
        
        System.out.println("Borrower: " + name);
        System.out.println("Days Overdue: " + daysOverdue);
        
        double ratePerDay;
        if (bookType == 'R') {
            ratePerDay = 20.00;
        } else if (bookType == 'F') {
            ratePerDay = 10.00;
        } else {
            ratePerDay = 5.00;
        }
        
        double fine = daysOverdue * ratePerDay;
        System.out.printf("Fine: P%.2f%n", fine);
        
        if (fine >= 100) {
            System.out.println("Borrowing: Suspended");
        } else {
            System.out.println("Borrowing: Allowed");
        }
    }
}
