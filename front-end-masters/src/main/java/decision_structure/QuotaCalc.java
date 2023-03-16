package decision_structure;

import java.util.Scanner;

public class QuotaCalc {
    public static void main(String[] args) {

        int quota = 10;

        System.out.print("Enter the number of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales >= quota) {
            System.out.println("congrats you met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not meat your quota. " + "You were " + salesShort + " sales short.");
        }

        scanner.close();
    }
}
