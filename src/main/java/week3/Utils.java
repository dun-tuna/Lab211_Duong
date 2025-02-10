/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Utils {

    static Scanner sc = new Scanner(System.in);

    public static int checkNumber() {
        while (true) {
            System.out.print("Enter size of array: ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                if(input<2){
                  throw new IllegalArgumentException("Error!");  
                }
                return input;
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
}
