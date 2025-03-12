/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author ADMIN
 */
abstract class ThreeDimensionalShape extends Shape {
    public abstract double getArea();
    public abstract double getVolume();
    public String getType() { return "Three-Dimensional Shape"; }
}
// Sphere class
class Sphere extends ThreeDimensionalShape {
    private double radius;
    public Sphere(double radius) { this.radius = radius; }
    public double getArea() { return 4 * Math.PI * radius * radius; }
    public double getVolume() { return (4.0/3) * Math.PI * radius * radius * radius; }
    public String toString() { return "Sphere with radius " + radius; }
}

// Cube class
class Cube extends ThreeDimensionalShape {
    private double side;
    public Cube(double side) { this.side = side; }
    public double getArea() { return 6 * side * side; }
    public double getVolume() { return side * side * side; }
    public String toString() { return "Cube with side " + side; }
}

// Tetrahedron class
class Tetrahedron extends ThreeDimensionalShape {
    private double edge;
    public Tetrahedron(double edge) { this.edge = edge; }
    public double getArea() { return Math.sqrt(3) * edge * edge; }
    public double getVolume() { return (Math.pow(edge, 3) / (6 * Math.sqrt(2))); }
    public String toString() { return "Tetrahedron with edge " + edge; }
}
