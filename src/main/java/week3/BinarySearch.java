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
public class BinarySearch {
    private int[] array;

    public BinarySearch(int n) {
        this.array = new int[n];;
    }

    public int search(int key) {
        int low = 0;
        int high = array.length - 1;
        int count = 0;

        while (low <= high) {
            count++;
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                System.out.println("Count: " + count);
                return mid; 
            } else if (array[mid] < key) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }
}
