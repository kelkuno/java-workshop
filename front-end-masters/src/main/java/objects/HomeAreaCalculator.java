package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        //call class, room 1 is its new name, rectangle() is a constructor
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);

        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("area of both rooms: " + totalArea);
    }
}
