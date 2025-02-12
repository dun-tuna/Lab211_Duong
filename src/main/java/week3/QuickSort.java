/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class QuickSort {
 private int[] array;

    public QuickSort(int n) {
        this.array = new int[n];
    }
    public int[] getArray() {
       return array;
}
    public void addValue() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    public void displayArray() {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public void sort() {
        quickSort(array, 0, array.length - 1);
    }
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private int partition(int[] arr, int low, int high) {
 int i = low;
        int j = high;
        int pv = arr[(i + j) / 2];
        while (i <= j) {
            while (arr[i] < pv) {
                i++;
            }
            while (arr[j] > pv) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
}
}