/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class BubbleSort {
 private int[] Array;

    public BubbleSort(int n) {
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
    public void sort() {
        int n = Array.length;
        int count=0;
        boolean check=false;
        for (int i = 0; i < n - 1 && !check ; i++) {
            check = true;
            for (int j = 0; j < n - i - 1; j++) {
                count ++;
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                    check=false;
                }
            }
        }
        System.out.println("Count="+count);
    }
}

