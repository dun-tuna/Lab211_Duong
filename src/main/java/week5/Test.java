/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) throws Exception {
//      CourseManagement courseMana = new CourseManagement();
//       OnlineCourse onlinecourse1 = new OnlineCourse();
//       OfflineCourse offlinecourse2 = new OfflineCourse();
//        onlinecourse1.inputAll("Window", "Duong", "", "PRF192", "C progaram", 1);
//        offlinecourse2.inputAll("IAO202", "Introduction Security", 3, "6/52025", "17/3/2025", "Danang");
//        courseMana.addOnlineCouse(onlinecourse1);
//        courseMana.addOfflineCourse(offlinecourse2);
//        courseMana.displayOnlineCourse();   
        CourseManagement cm = new CourseManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCourse Management System");
            System.out.println("1. Add Online Course");
            System.out.println("2. Add Offline Course");
            System.out.println("3. Delete Course");
            System.out.println("4. Update Course");
            System.out.println("5. Display Online Courses");
            System.out.println("6. Display Offline Courses");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Online Course ID: ");
                    String onlineId = scanner.nextLine();
                    System.out.print("Enter Online Course Name: ");
                    String onlineName = scanner.nextLine();
                    System.out.print("Enter Credit: ");
                    int credit = scanner.nextInt();
                    System.out.print("Enter Platform: ");
                    String platform = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter Course Instructor: ");
                    String instructor = scanner.nextLine();
                    System.out.print("Enter Note: ");
                    String note = scanner.nextLine();
                    scanner.nextLine(); // Consume newline
                    OnlineCourse onlineCourse = new OnlineCourse();
                    onlineCourse.inputAll(onlineId, onlineName, credit, platform, instructor, note);
                    cm.addOnlineCouse(onlineCourse);
                    System.out.println("Online Course added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Offline Course ID: ");
                    String offlineId = scanner.nextLine();
                    System.out.print("Enter Offline Course Name: ");
                    String offlineName = scanner.nextLine();
                    System.out.print("Enter Credit: ");
                    credit = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Begin: ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter End : ");
                    String endDate = scanner.nextLine();
                    System.out.print("Enter Campus: ");
                    String location = scanner.nextLine();
                    OfflineCourse offlineCourse = new OfflineCourse();
                    offlineCourse.inputAll(offlineId, offlineName, credit, startDate, endDate, location);
                    cm.addOfflineCourse(offlineCourse);
                    System.out.println("Offline Course added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Course ID to delete: ");
                    String delId = scanner.nextLine();
                    if (cm.deleteCourse(delId)) {
                        System.out.println("Course deleted successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Course ID to update: ");
                    String updateId = scanner.nextLine();
                    cm.upadateCourse(updateId);
                    System.out.println("Course updated successfully.");
                    break;
                case 5:
                    cm.displayOnlineCourse();
                    break;
                case 6:
                    cm.displayOfflineCourses();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
