package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input tipe of figure");
        String input = sc.next();
        FigureFactory ff = new FigureFactory();
        Figure figure = ff.createFigure(input);
        figure.getRezult();
    }
}
