// october 21, 2026 | if else if
import java.util.Scanner;

public class FareDiscount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char passengerType = input.next().charAt(0);
        
        final double MIN_FARE = 13;
        double discountFare = MIN_FARE - (MIN_FARE * 0.2);
        
        if (passengerType == 'S') {
            System.out.println("Passenger: Student");
            System.out.printf("Fare: P%.2f%n", discountFare);
        } else if (passengerType == 'C') {
            System.out.println("Passenger: Senior Citizen");
            System.out.printf("Fare: P%.2f%n", discountFare);
        } else if (passengerType == 'P') {
            System.out.println("Passenger: PWD");
            System.out.printf("Fare: P%.2f%n", discountFare);
        } else if (passengerType == 'R') {
            System.out.println("Passenger: Regular");
            System.out.printf("Fare: P%.2f%n", MIN_FARE);
        }
    }
}
