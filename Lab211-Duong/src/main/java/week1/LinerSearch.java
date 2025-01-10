/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LinerSearch {

    private int[] Array;

    public LinerSearch(int n) {
        this.Array = new int[n];
    }

    void addvalue() {
       Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(Array.length);
        }

    }

    void displayArray() {
        for (int n : Array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    int searchValue(int number) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == number) {
                return  i;
            }
        }
        return -1;
    }
}
