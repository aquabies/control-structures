// november 4, 2026 | BIG task
import java.util.Scanner;

public class MallParkingFee{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String plateNumber = input.nextLine();
        char vehicle = input.nextLine().charAt(0);
        int hoursParked = input.nextInt();
        
        double parkingFee = 0;
        double overnightFee = 150;
        double total = 0;
        
        switch (vehicle){
            case 'C':
                System.out.println("Plate Number: " + plateNumber);
                System.out.println("Vehicle: Car");
                System.out.println("Hours Parked: " + hoursParked);
                
                if (hoursParked <= 3){
                    parkingFee = 50;
                    overnightFee = 0;
                    total = parkingFee + overnightFee;
                    System.out.printf("Parking Fee: P%.2f%n", parkingFee);
                    System.out.printf("Overnight Fee: P%.2f%n", overnightFee);
                    System.out.printf("Total: P%.2f%n", total);
                } else if (hoursParked <= 12){
                    parkingFee = 50 + (20*(hoursParked - 3));
                    overnightFee = 0;
                    total = parkingFee + overnightFee;
                    System.out.printf("Parking Fee: P%.2f%n", parkingFee);
                    System.out.printf("Overnight Fee: P%.2f%n", overnightFee);
                    System.out.printf("Total: P%.2f%n", total);
                } else if (hoursParked > 12){
                    parkingFee = 50 + (20*(hoursParked - 3));
                    total = parkingFee + overnightFee;
                    System.out.printf("Parking Fee: P%.2f%n", parkingFee);
                    System.out.printf("Overnight Fee: P%.2f%n", overnightFee);
                    System.out.printf("Total: P%.2f%n", total);
                }
                break;
                
            case 'M':
                System.out.println("Plate Number: " + plateNumber);
                System.out.println("Vehicle: Motorcycle");
                System.out.println("Hours Parked: " + hoursParked);
                
                if (hoursParked <= 3){
                    parkingFee = 30;
                    overnightFee = 0;
                    total = parkingFee + overnightFee;
                    System.out.printf("Parking Fee: P%.2f%n", parkingFee);
                    System.out.printf("Overnight Fee: P%.2f%n", overnightFee);
                    System.out.printf("Total: P%.2f%n", total);
                } else if (hoursParked <= 12){
                    parkingFee = 30 + (10*(hoursParked - 3));
                    overnightFee = 0;
                    total = parkingFee + overnightFee;
                    System.out.printf("Parking Fee: P%.2f%n", parkingFee);
                    System.out.printf("Overnight Fee: P%.2f%n", overnightFee);
                    System.out.printf("Total: P%.2f%n", total);
                } else if (hoursParked > 12){
                    parkingFee = 30 + (10*(hoursParked - 3));
                    total = parkingFee + overnightFee;
                    System.out.printf("Parking Fee: P%.2f%n", parkingFee);
                    System.out.printf("Overnight Fee: P%.2f%n", overnightFee);
                    System.out.printf("Total: P%.2f%n", total);
                }
                break;
            default:
            System.out.println("Invalid vehicle type.");
        }
    }
}
