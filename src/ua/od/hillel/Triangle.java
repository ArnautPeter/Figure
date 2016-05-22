package ua.od.hillel;

public class Triangle implements Figure {

    private double a, b, c;

    Triangle(double a, double b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void getRezult() {
        System.out.println("The area is " + getArea() + " and the perimetr is " + getPerimeter());
    }
}
