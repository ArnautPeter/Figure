package ua.od.hillel;

public class Quadrangle extends Square {

    private double a, b, c, d;

    Quadrangle(double a, double b, double c, double d) {
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public void getRezult() {
        System.out.println("The area is " + getArea() + " and the perimetr is " + getPerimeter());
    }
}
