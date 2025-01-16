/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import static java.lang.Math.sqrt;

/**
 *
 * @author ADMIN
 */
public class SolvingEquation {

    private double a;
    private double b;
    private double c;

    public SolvingEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        double x1 = 0;
        double x2 = 0;
        if (delta < 0) {
            System.out.println("No solution");
        }
        if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        }
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }

}
