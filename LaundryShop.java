// november 4, 2026
import java.util.Scanner;

public class LaundryShop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        char serviceLetter = input.nextLine().charAt(0);
        double weight = input.nextDouble();
        
        String service = "";
        int rate = 0;
        double discount = 0;
        double total = 0;
        double amount = 0;
        
        if (weight < 3){
            weight = 3;
        }
        
        if (serviceLetter == 'W'){
            service = "Wash Only";
            rate = 35;
            System.out.println("Customer: " + name);
            System.out.println("Service: " + service);
            System.out.println("Kilos Charged: " + weight);
            amount = (double) weight * rate;
            System.out.printf("Amount: P%.2f%n", amount);
            if (amount >= 500){
                discount = amount * 0.1;
                total = amount - discount;
                System.out.printf("Discount: P%.2f%n", discount);
                System.out.printf("Total: P%.2f%n", total);
            } else if (amount < 500){
                discount = 0;
                System.out.printf("Discount: P%.2f%n", discount);
                System.out.printf("Total: P%.2f%n", amount);
            }
        } else if (serviceLetter == 'D'){
            service = "Wash and Dry";
            rate = 55;
            System.out.println("Customer: " + name);
            System.out.println("Service: " + service);
            System.out.println("Kilos Charged: " + weight);
            amount = (double) weight * rate;
            System.out.printf("Amount: P%.2f%n", amount);
            if (amount >= 500){
                discount = amount * 0.1;
                total = amount - discount;
                System.out.printf("Discount: P%.2f%n", discount);
                System.out.printf("Total: P%.2f%n", total);
            } else if (amount < 500){
                discount = 0;
                System.out.printf("Discount: P%.2f%n", discount);
                System.out.printf("Total: P%.2f%n", amount);
            }
        } else if (serviceLetter == 'F'){
            service = "Full Service";
            rate = 75;
            System.out.println("Customer: " + name);
            System.out.println("Service: " + service);
            System.out.println("Kilos Charged: " + weight);
            amount = (double) weight * rate;
            System.out.printf("Amount: P%.2f%n", amount);
            if (amount >= 500){
                discount = amount * 0.1;
                total = amount - discount;
                System.out.printf("Discount: P%.2f%n", discount);
                System.out.printf("Total: P%.2f%n", total);
            } else if (amount < 500){
                discount = 0;
                System.out.printf("Discount: P%.2f%n", discount);
                System.out.printf("Total: P%.2f%n", amount);
            }
        } else {
            System.out.println("Invalid service.");
        }
    }
}
