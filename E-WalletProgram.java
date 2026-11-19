// november 17, 2026 | do while and nested switch case if else
import java.util.Scanner;

public class E-WalletProgram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        
        double amount = 0;
        double finalBalance = 0;
        int action;
        
        do {
            action = input.nextInt();
        
            switch(action){
                case 1:
                    amount = input.nextDouble();
                    balance += amount;
                    System.out.printf("Cash In: P%.2f | Balance: P%.2f%n", amount, balance);   
                    break;
                case 2:
                    amount = input.nextDouble();
                    if (balance >= amount){
                        balance -= amount;
                        System.out.printf("Payment: P%.2f | Balance: P%.2f%n", amount, balance);
                    } else {
                        System.out.println("Payment declined. Not enough balance.");
                    }
                    break;
                case 3:
                    System.out.printf("Balance: P%.2f%n", balance);
                    break;
                case 4:
                    finalBalance += balance;
                    System.out.println("Thank you!");
                    System.out.printf("Final Balance: P%.2f", finalBalance);
                    break;
                default:
                System.out.println("Invalid choice.");
            }
        } while (action != 4);
    }
}
