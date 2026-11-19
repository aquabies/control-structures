// october 29, 2026 | for and nested if
import java.util.Scanner;

public class SavingsGoaL{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();
        double itemPrice = input.nextDouble();
        double saveAmount = input.nextDouble();
        
        double weekSaveAmount = 0;
        double extraMoney = 0;
        int weekNeeded = 0;
        for (int week = 1; weekSaveAmount < itemPrice; week++){
            weekSaveAmount += saveAmount;
            System.out.print("Week " + week + ":");
            System.out.printf(" P%.2f%n", weekSaveAmount);
            weekNeeded++;
            
            if (weekSaveAmount >= itemPrice){
                extraMoney = weekSaveAmount - itemPrice;
            }
        }
        
        System.out.println("Item: " + item);
        System.out.println("Weeks Needed: " + weekNeeded);
        System.out.printf("Extra Money: P%.2f%n", extraMoney);
    }
}
