/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String args[]) {
        StudentMangement stMana = new StudentMangement();
        Scanner scanner = new Scanner(System.in);
                while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Find Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Update Student");
            System.out.println("6. Sort Students");
            System.out.println("7. Report");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Semester: ");
                    String semester = scanner.nextLine();
                    System.out.print("Enter Course Name: ");
                    String course = scanner.nextLine();
                    Student student = new Student(id, name, semester, course);
                    if (stMana.addStudent(student)) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Student already exists.");
                    }
                    break;
                case 2:
                    stMana.displayStudent();
                    break;
                case 3:
                    System.out.print("Enter Student Name to Find: ");
                    String searchName = scanner.nextLine();
                    List<Student> foundStudents = stMana.findStudnet(searchName);
                    if (foundStudents.isEmpty()) {
                        System.out.println("No student found.");
                    } else {
                        foundStudents.forEach(System.out::println);
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID to Remove: ");
                    String removeId = scanner.nextLine();
                    int removed = stMana.removeStudent(removeId);
                    System.out.println(removed > 0 ? "Student removed successfully." : "Student not found.");
                    break;
                case 5:
                    System.out.print("Enter Student ID to Update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Semester: ");
                    String newSemester = scanner.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = scanner.nextLine();
                    Student updatedStudent = new Student(updateId, newName, newSemester, newCourse);
                    boolean updated = stMana.updateStudent(updatedStudent);
                    System.out.println(updated ? "Student updated successfully." : "Student not found.");
                    break;
                case 6:
                    stMana.sortStudent();
                    System.out.println("Students sorted by name.");
                    break;
                case 7:
                    stMana.report();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
  }

