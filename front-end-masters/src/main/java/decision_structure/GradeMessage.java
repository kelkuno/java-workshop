package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("enter letter grade");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade) {
            case "A":
                message = "excellent job!";
                break;

            case "B":
                message = "great job!";
                break;

            case "D":
                message = "You need to work a bit harder";
                break;

            case "F":
                message = "Uh oh!";
                break;

            default:
                message = "error, invalid grade";
                break;

        }

        System.out.println(message);

    }
}
