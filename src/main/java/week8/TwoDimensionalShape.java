/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author ADMIN
 */
abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
    public String getType() { return "Two-Dimensional Shape"; }
}
// Circle class
class Circle extends TwoDimensionalShape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public String toString() { return "Circle with radius " + radius; }
}

// Square class
class Square extends TwoDimensionalShape {
    private double side;
    public Square(double side) { this.side = side; }
    public double getArea() { return side * side; }
    public String toString() { return "Square with side " + side; }
}

// Triangle class
class Triangle extends TwoDimensionalShape {
    private double base, height;
    public Triangle(double base, double height) { this.base = base; this.height = height; }
    public double getArea() { return 0.5 * base * height; }
    public String toString() { return "Triangle with base " + base + " and height " + height; }
}