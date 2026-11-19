// november 11, 2026 | big task
import java.util.Scanner;

public class Lu{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberPassengers = input.nextInt();
        
        final double JEEPNEY_FARE = 13;
        final double EVERY_KILOMETER = 1.8;
        final double DISCOUNT = 0.2;
        String passenger = "";
        int counter;
        double baseFare = 0;
        double discountedFare = 0;
        double totalFare = 0;
        
        for (counter = 1; counter <= numberPassengers; counter++){
            char passengerType = input.next().charAt(0);
            double distance = input.nextDouble();
            
            switch (passengerType){
                case 'S':
                    passenger = "Student";
                    if (distance <= 4){
                        baseFare = JEEPNEY_FARE;
                        discountedFare = baseFare - (baseFare * DISCOUNT);
                    } else {
                        baseFare = JEEPNEY_FARE + ((distance - 4) * EVERY_KILOMETER);
                        discountedFare = baseFare - (baseFare * DISCOUNT);
                    }
                    break;
                case 'C':
                    passenger = "Senior Citizen";
                    if (distance <= 4){
                        baseFare = JEEPNEY_FARE;
                        discountedFare = baseFare - (baseFare * DISCOUNT);
                    } else {
                        baseFare = JEEPNEY_FARE + ((distance - 4) * EVERY_KILOMETER);
                        discountedFare = baseFare - (baseFare * DISCOUNT);
                    }
                    break;
                case 'P':
                    passenger = "PWD";
                    if (distance <= 4){
                        baseFare = JEEPNEY_FARE;
                        discountedFare = baseFare - (baseFare * DISCOUNT);
                    } else {
                        baseFare = JEEPNEY_FARE + ((distance - 4) * EVERY_KILOMETER);
                        discountedFare = baseFare - (baseFare * DISCOUNT);
                    }
                    break;
                default:
                passenger = "Regular";
                if (distance <= 4){
                    baseFare = JEEPNEY_FARE;
                    discountedFare = baseFare;
                } else {
                    baseFare = JEEPNEY_FARE + ((distance - 4) * EVERY_KILOMETER);
                    discountedFare = baseFare;
                }
            }
            
            System.out.printf("Passenger %d: %s, %.1f km, P%.2f%n", counter, passenger, distance, discountedFare);
            totalFare += discountedFare;
        }
        System.out.printf("Total Fare: P%.2f", totalFare);
    }
}
