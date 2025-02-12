/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author ADMIN
 */
public class FindBinary {

    int[] a;

    public FindBinary(int value) {
        this.a = new int[value];
    }

    public int search(int value) {
        int low = 0;
        int high = a.length - 1;
        int count = 0;
        while (low <= high) {
            count++;
            int mid = (low + high) / 2;

            if (a[mid] == value) {
                System.out.println("Count " + count);
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
