package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        //do/while loop is not heavily used in the industry

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("enter the first numbre");
            double num1 = scanner.nextDouble();
            System.out.println("enter the second number");
            double num2 = scanner.nextDouble();

            System.out.println("sum: " + (num1 + num2));

            System.out.println("would you like to do it again? false for no, true for yes");
            again = scanner.nextBoolean();

        }while(again);
    }
}
