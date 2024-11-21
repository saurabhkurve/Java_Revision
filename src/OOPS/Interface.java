package OOPS;


interface Shape{
    double calculateArea(double length, double breath);
}

class Circle implements Shape  {

    @Override
    public double calculateArea(double radius, double breath) {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{

    @Override
    public double calculateArea(double length, double breath) {
        return length * breath;
    }
}

public class Interface {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of circle is " + (float)  circle.calculateArea(2,2));

        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle is " + (float)  rectangle.calculateArea(2,2));


    }
}
