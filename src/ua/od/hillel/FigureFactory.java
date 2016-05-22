package ua.od.hillel;

import java.util.Random;

public class FigureFactory {

    Random random = new Random();

    public Figure createFigure(String type) {
        Figure figure;

        switch (type) {
            case "circle":
                figure = new Circle(random.nextInt(10));
                break;
            case "triangle":
                figure = new Triangle(random.nextInt(10), random.nextInt(10), random.nextInt(10));
                break;
            case "square":
                figure = new Square(random.nextInt(15));
                break;
            case "quadrangle":
                figure = new Quadrangle(random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10));
                break;
            default:
                figure = new Default();
        }

        return figure;
    }
}
