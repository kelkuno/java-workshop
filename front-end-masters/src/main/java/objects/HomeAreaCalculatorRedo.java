package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //call class, room 1 is its new name, rectangle() is a constructor
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        double totalArea = calculator.calculateAreaOfRoom(room1, room2);


        System.out.println("area of both rooms: " + totalArea);
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("enter width of room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);

    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
