package objects;

public class Rectangle {

    //getter/setter methods -- or also called mutator methods

    //fields or data are private
    //CONVENTIONS: constructors typically come after global fields
    protected double length;
    protected double width;
    protected int sides = 4;


    //constructor--same name as Class--it looks like a method,
    //constructor that doesnt take arguments is called a default consructor
    //class has a default constructor -- but iif you want it to do something, you need to explicit it

    //constructor are not methods --they don't have returns --
    //up to the caller to provide which constructor to use,
    public Rectangle(){
        setLength(0);
        setWidth(0);

    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void print() {
        System.out.println("i am super prirnt");
    }

    //behaviors are public
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        //this = global instance, this class. so what this means is the local variable length, set this to
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
