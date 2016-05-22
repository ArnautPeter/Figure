package ua.od.hillel;

public class Circle implements Figure {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getRezult() {
        System.out.println("The area is " + getArea() + " and the perimetr is " + getPerimeter());
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * radius * 2;
    }
}
