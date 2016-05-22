package ua.od.hillel;

public class Square implements Figure {

    private double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public void getRezult() {
        System.out.println("The area is " + getArea() + " and the perimetr is " + getPerimeter());
    }

}
