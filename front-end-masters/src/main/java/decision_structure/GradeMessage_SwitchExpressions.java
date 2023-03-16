package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("enter letter grade");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        //whole purpose of switch expression is to assign a value.
        //they are not a replacement to switch statements. cases for both.
        //statements is when you need to execute code
        //if you want to do other code inside case, just make sure the last statement says "yield" because switch expressions need to assign a value.

        String message = switch(grade) {
            case "A" -> "excellent job!";

            case "B" -> {
                System.out.println("print");
                yield "great job!";
            }

            case "D"-> "You need to work a bit harder";

            case "F" -> "Uh oh!";

            default -> "error, invalid grade";

        };

        System.out.println(message);

    }
}
