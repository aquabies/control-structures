import java.util.Scanner;

public class WorkoutCounter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String exercise = input.nextLine();
        int sets = input.nextInt();
        int reps = input.nextInt();
        
        int number = 0;
        
        System.out.println("Exercise: " + exercise);
        for (int set = 1; set <= sets; set++){
            number = 1;
            System.out.print("Set " + set + ": ");
            for (int rep = 1; rep <= reps; rep++){
                System.out.printf(number + " ");
                number++;
            }
            System.out.println();
        }
        int totalReps = sets * reps;
        System.out.println("Total Reps: " + totalReps);
        input.close();
    }
}
