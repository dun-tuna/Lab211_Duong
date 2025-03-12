/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Test {
      public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Triangle(3, 6));
        shapes.add(new Sphere(3));
        shapes.add(new Cube(2));
        shapes.add(new Tetrahedron(4));

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Surface Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
