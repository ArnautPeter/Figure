package ua.od.hillel;

public class Default implements Figure {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void getRezult() {
        System.out.println("This is not a figure");
    }
}
