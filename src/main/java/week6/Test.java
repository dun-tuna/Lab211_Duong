///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package week6;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//import static week4.bai2.Utils.isValidId;
//import static week6.Utils.isValidPhoneNumber;
//
///**
// *
// * @author ADMIN
// */
//public class Test {
//
//    public static void main(String[] args) {
//        DevelopContactManagement devContact = new DevelopContactManagement();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n========= Contact program =========");
//            System.out.println("1. Add a Contact");
//            System.out.println("2. Display all Contact");
//            System.out.println("3. Delete a Contact");
//            System.out.println("4. Exit");
//            System.out.print("Choose an option: ");
//            int choice = sc.nextInt();
//            sc.nextLine();
//            switch (choice) {
//                case 1:
//                    System.out.println("\n-------- Add a Contact --------");
//                    System.out.print("Input ID of Contact:");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//                    System.out.print("Input Name of Contact:");
//                    String name=sc.nextLine();
//                    System.out.print("Input Group of Contact:");
//                    String group=sc.nextLine();
//                    System.out.print("Input Address of Contact:");
//                    String add=sc.nextLine(); 
//                    System.out.print("Input Phone of Contact:");
//                    String phone=sc.nextLine();
//                   // Contact con = new Contact();
//                    //con.inputAll(id, name, group, add, phone);
//                    devContact.addContact(con);
//                    System.out.print("Add Contact sucessfull!");
//                    break;
//                case 2:
//                    devContact.display();
//                    break;
//                case 3:
//                    System.out.print("Input id of Contact you want to delete:");
//                    int idd= sc.nextInt();
//                    if(devContact.delete(idd)){
//                        System.out.println("Course deleted successfully.");
//                    } else {
//                        System.out.println("Course not found.");
//                    }
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    sc.close();
//                    return;
//                default:
//                    System.out.println("Invalid choice, please try again.");
//            }
//        }
//     }
//}
