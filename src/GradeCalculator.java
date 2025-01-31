import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your percentage grade (0-100): ");

        if(scanner.hasNextDouble()){
            double percentage = scanner.nextDouble();
            String classification = classifyGrade(percentage);
            System.out.println("Your classification: " + classification);
        } else {
            System.out.println("Invalid Input. Please enter a numeric value.");
        }
    }

    public static String classifyGrade(double percentage){


        if (percentage > 100 || percentage < 0) {
            return "Invalid input. Please enter a percentage between 0 and 100.";
        } else if (percentage > 70) {
            return "First Class";

        } else if (percentage > 60) {

            return "Second Class (Upper Division) - 2:1";

        } else if (percentage > 50) {
            return "Second Class (Lower Division) - 2:2";

        } else if (percentage > 40) {
            return "Third Class";

        } else {
            return "Fail";
        }
    }

}




