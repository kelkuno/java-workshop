package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("how many hours of work");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 0){
            System.out.println("Invalid entry. Your hours must be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("gross pay:" + grossPay);
    }
}
