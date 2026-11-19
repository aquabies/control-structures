// october 21, 2026
import java.util.Scanner;

public class CanteenMealOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mealNumber = input.nextInt();
        int quantity = input.nextInt();
        
        String meal;
        double price;
        
        switch (mealNumber) {
        case 1:
            meal = "Chicken Adobo with Rice";
            price = 65.00;
            break;
        case 2:
            meal = "Pork Sinigang with Rice";
            price = 75.00;
            break;
        case 3:
            meal = "Pancit Canton";
            price = 45.00;
            break;
        case 4:
            meal = "Tortang Talong with Rice";
            price = 55.00;
            break;
        default:
            price = 0;
            System.out.println("Invalid meal number.");
            return;
        }
        
        double total = price * quantity;
        
        System.out.println("Meal: " + meal);
        System.out.printf("Price: P%.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total: P%.2f%n", total);
    }
}
